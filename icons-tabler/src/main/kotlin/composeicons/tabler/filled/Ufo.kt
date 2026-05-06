package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Ufo: ImageVector
    get() {
        if (_ufo != null) return _ufo!!
        _ufo = tablerFilledIcon(
            name = "Ufo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 3c3.067 0 5.6 2.29 5.957 5.246C21.024 9.149 23 10.722 23 12.724c0 2.3-2.653 4.053-6.427 4.833l1.26 1.888c.307 .46 .182 1.081-.278 1.388-.46 .307-1.081 .182-1.388-.278L14.388 17.885C13.618 17.961 12.818 18 12 18c-.966 0-1.905-.055-2.801-.16L7.894 20.447c-.256 .476-.844 .661-1.327 .42-.483-.242-.687-.823-.461-1.314L7.134 17.493C3.516 16.686 1 14.964 1 12.725 1 10.726 2.981 9.145 6.044 8.242 6.404 5.287 8.934 3 12 3M12.01 13l-.127 .007c-.525 .062-.911 .523-.88 1.052 .031 .528 .468 .941 .997 .941l.127-.007c.525-.062 .911-.523 .88-1.052-.031-.528-.468-.941-.997-.941M7.01 12l-.127 .007c-.525 .062-.911 .523-.88 1.052 .031 .528 .468 .941 .997 .941l.127-.007c.525-.062 .911-.523 .88-1.052C7.976 12.413 7.539 12.001 7.01 12M17.01 12l-.127 .007c-.525 .062-.911 .523-.88 1.052 .031 .528 .468 .941 .997 .941l.127-.007c.525-.062 .911-.523 .88-1.052-.031-.528-.468-.941-.997-.941M12 5C9.89 5 8.165 6.618 8.011 8.667c.046 .128 .065 .264 .057 .4 .104 .087 .348 .251 .768 .419C9.642 9.808 10.776 10 12 10c1.224 0 2.358-.192 3.164-.514 .445-.178 .693-.352 .789-.435L15.95 9q0-.113 .029-.229l.014-.046C15.868 6.649 14.129 5 12 5"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _ufo!!
    }

private var _ufo: ImageVector? = null

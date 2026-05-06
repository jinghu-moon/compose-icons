package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CoatHanger: ImageVector
    get() {
        if (_coatHanger != null) return _coatHanger!!
        _coatHanger = phosphorLightIcon(
            name = "CoatHanger",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240.37 172.8 138 96 163.59 76.8C165.105 75.669 165.998 73.89 166 72 166 51.013 148.987 34 128 34 107.013 34 90 51.013 90 72c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6 .09-13.733 10.844-25.028 24.557-25.79 13.712-.762 25.653 9.272 27.263 22.91l-29.32 22-.21 .16L15.63 172.8c-4.816 3.612-6.784 9.899-4.886 15.613 1.898 5.714 7.236 9.574 13.256 9.587h208c6.024-.004 11.37-3.862 13.273-9.578 1.903-5.716-.064-12.008-4.883-15.622ZM233.87 184.63c-.224 .839-1.002 1.409-1.87 1.37h-208c-.859-.004-1.619-.557-1.889-1.372-.27-.816 .012-1.712 .699-2.228L128 103.5l105.17 78.9c.733 .483 1.025 1.415 .7 2.23Z"),
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
        return _coatHanger!!
    }

private var _coatHanger: ImageVector? = null

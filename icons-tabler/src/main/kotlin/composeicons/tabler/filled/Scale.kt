package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Scale: ImageVector
    get() {
        if (_scale != null) return _scale!!
        _scale = tablerFilledIcon(
            name = "Scale",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c.552 0 1 .448 1 1v1.152l5.159 .86c.254 .039 .482 .175 .636 .38l.041 .059 .058 .102 3.024 6.05 .035 .094 .025 .096 .016 .1 .005 .12-.003 .061C21.958 14.254 20.18 16 18 16c-2.209 0-4-1.791-4-4 0-.155 .036-.308 .106-.447L16.499 6.763 13 6.18v12.82h4c.552 0 1 .448 1 1 0 .552-.448 1-1 1h-10C6.448 21 6 20.552 6 20c0-.552 .448-1 1-1h4v-12.82L7.5 6.763l2.418 4.84 .035 .094 .025 .096 .016 .1 .005 .12-.003 .061C9.958 14.254 8.18 16 6 16 3.791 16 2 14.209 2 12c0-.155 .036-.308 .106-.447L5.14 5.488l.039-.061 .025-.034c.154-.205 .382-.341 .636-.38L11 4.151v-1.151c0-.552 .448-1 1-1"),
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
        return _scale!!
    }

private var _scale: ImageVector? = null

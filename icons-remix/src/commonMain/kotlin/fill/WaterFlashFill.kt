package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.WaterFlashFill: ImageVector
    get() {
        if (_waterFlashFill != null) return _waterFlashFill!!
        _waterFlashFill = remixIcon(
            name = "WaterFlashFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 5.641 6.639 L 12.005 0.275 L 18.369 6.639 C 21.884 10.153 21.884 15.852 18.369 19.367 C 14.854 22.881 9.156 22.881 5.641 19.367 C 2.126 15.852 2.126 10.153 5.641 6.639 L 5.641 6.639 ZM 13.005 11.003 L 13.005 6.503 L 8.505 13.003 L 11.005 13.003 L 11.005 17.503 L 15.505 11.003 L 13.005 11.003 Z"),
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
        return _waterFlashFill!!
    }

private var _waterFlashFill: ImageVector? = null

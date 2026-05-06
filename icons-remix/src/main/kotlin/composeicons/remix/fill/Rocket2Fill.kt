package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Rocket2Fill: ImageVector
    get() {
        if (_rocket2Fill != null) return _rocket2Fill!!
        _rocket2Fill = remixIcon(
            name = "Rocket2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8.498 20.005h7.004c-.659 1.579-1.922 2.843-3.502 3.502C10.421 22.848 9.157 21.584 8.498 20.005ZM18 14.809l2 2.268v1.927h-16v-1.927L6 14.809v-5.805C6 5.522 8.504 2.558 12 1.46c3.496 1.098 6 4.062 6 7.545v5.805ZM12 11.005c1.105 0 2-.895 2-2C14 7.9 13.105 7.005 12 7.005c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2Z"),
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
        return _rocket2Fill!!
    }

private var _rocket2Fill: ImageVector? = null

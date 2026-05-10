package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.HardDrive3Fill: ImageVector
    get() {
        if (_hardDrive3Fill != null) return _hardDrive3Fill!!
        _hardDrive3Fill = remixIcon(
            name = "HardDrive3Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5.5 2c-.504 0-.93 .376-.992 .876L3.008 14.876C3.003 14.917 3 14.958 3 15v6c0 .552 .448 1 1 1h16c.552 0 1-.448 1-1v-6c0-.042-.003-.083-.008-.124L19.492 2.876C19.43 2.376 19.004 2 18.5 2h-13ZM5 16h14v4h-14v-4ZM15 17h2v2h-2v-2ZM13 17h-2v2h2v-2Z"),
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
        return _hardDrive3Fill!!
    }

private var _hardDrive3Fill: ImageVector? = null

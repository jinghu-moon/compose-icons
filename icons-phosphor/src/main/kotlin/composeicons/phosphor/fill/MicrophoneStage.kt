package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.MicrophoneStage: ImageVector
    get() {
        if (_microphoneStage != null) return _microphoneStage!!
        _microphoneStage = phosphorFillIcon(
            name = "MicrophoneStage",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M115.06 46.36c-.837-.837-2.002-1.261-3.181-1.157-1.179 .104-2.252 .725-2.929 1.697C100.512 58.943 95.99 73.295 96 88c.007 3.15 .218 6.297 .63 9.42L27.12 192.22c-4.703 6.361-4.026 15.209 1.59 20.78L43 227.29c5.571 5.616 14.419 6.293 20.78 1.59l94.81-69.53c3.119 .418 6.263 .636 9.41 .65 14.7 .014 29.047-4.501 41.09-12.93 .971-.677 1.592-1.75 1.697-2.929 .104-1.179-.319-2.344-1.157-3.181ZM117.67 149.64l-16 16c-2.002 2.107-4.99 2.963-7.804 2.235-2.814-.728-5.012-2.926-5.74-5.74-.728-2.814 .127-5.802 2.235-7.804l16-16c3.145-2.988 8.099-2.925 11.167 .143 3.068 3.068 3.131 8.022 .143 11.167ZM227.07 129.08c-.677 .975-1.752 1.598-2.934 1.702-1.182 .104-2.349-.322-3.186-1.163L126.38 35.05c-.841-.837-1.267-2.004-1.162-3.186 .104-1.182 .728-2.257 1.702-2.934 28.591-19.95 67.372-16.525 92.023 8.127 24.652 24.652 28.077 63.433 8.127 92.023Z"),
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
        return _microphoneStage!!
    }

private var _microphoneStage: ImageVector? = null

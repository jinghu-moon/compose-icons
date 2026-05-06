package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MicrophoneStage: ImageVector
    get() {
        if (_microphoneStage != null) return _microphoneStage!!
        _microphoneStage = phosphorLightIcon(
            name = "MicrophoneStage",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M168 18c-20.313-.014-39.629 8.805-52.924 24.162C101.78 57.519 95.818 77.898 98.74 98L28.74 193.46c-4.116 5.561-3.524 13.3 1.39 18.17l14.3 14.3c4.872 4.91 12.608 5.502 18.17 1.39l95.46-70c25.896 3.635 51.659-7.467 66.801-28.786 15.142-21.32 17.139-49.302 5.177-72.555C218.076 32.725 194.15 18.078 168 18ZM226 88c.012 13.309-4.581 26.212-13 36.52L131.49 43c17.354-14.111 41.278-16.975 61.473-7.36C213.157 45.255 226.015 65.634 226 88ZM55.5 217.59c-.797 .585-1.902 .5-2.6-.2L38.61 203.1c-.7-.698-.785-1.803-.2-2.6l64.22-87.56c7.144 18.597 21.842 33.29 40.44 40.43ZM110 88c-.005-13.308 4.587-26.209 13-36.52L204.53 133c-17.364 14.08-41.275 16.927-61.46 7.318C122.885 130.71 110.02 110.355 110 88ZM108.25 147.75c1.127 1.125 1.76 2.653 1.76 4.245 0 1.592-.633 3.12-1.76 4.245l-8 8c-2.344 2.344-6.146 2.344-8.49 0-2.344-2.344-2.344-6.146 0-8.49l8-8c1.124-1.131 2.653-1.768 4.248-1.77 1.595-.002 3.125 .631 4.252 1.76Z"),
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

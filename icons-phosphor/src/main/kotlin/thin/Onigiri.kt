package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Onigiri: ImageVector
    get() {
        if (_onigiri != null) return _onigiri!!
        _onigiri = phosphorThinIcon(
            name = "Onigiri",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.11f, 148.63f),
                    PathNode.LineTo(172.23f, 52.63f),
                    PathNode.LineTo(172.17f, 52.54f),
                    PathNode.CurveTo(162.68233f, 37.2683f, 145.97891f, 27.981049f, 128.0f, 27.981049f),
                    PathNode.CurveTo(110.02109f, 27.981049f, 93.317696f, 37.2683f, 83.83f, 52.54f),
                    PathNode.LineTo(83.77f, 52.63f),
                    PathNode.LineTo(27.89f, 148.63f),
                    PathNode.CurveTo(17.962717f, 164.66673f, 17.497223f, 184.82166f, 26.673553f, 201.29959f),
                    PathNode.CurveTo(35.849884f, 217.77754f, 53.22925f, 227.9949f, 72.09f, 228.0f),
                    PathNode.LineTo(183.91f, 228.0f),
                    PathNode.CurveTo(202.77075f, 227.9949f, 220.15012f, 217.77754f, 229.32645f, 201.29959f),
                    PathNode.CurveTo(238.50278f, 184.82166f, 238.03728f, 164.66673f, 228.11f, 148.63f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 220.0f),
                    PathNode.LineTo(92.0f, 220.0f),
                    PathNode.LineTo(92.0f, 168.0f),
                    PathNode.CurveTo(92.0f, 165.79086f, 93.79086f, 164.0f, 96.0f, 164.0f),
                    PathNode.LineTo(160.0f, 164.0f),
                    PathNode.CurveTo(162.20914f, 164.0f, 164.0f, 165.79086f, 164.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(222.36f, 197.39f),
                    PathNode.CurveTo(214.68823f, 211.43546f, 199.9136f, 220.12349f, 183.91f, 220.0f),
                    PathNode.LineTo(172.0f, 220.0f),
                    PathNode.LineTo(172.0f, 168.0f),
                    PathNode.CurveTo(172.0f, 161.37259f, 166.62741f, 156.0f, 160.0f, 156.0f),
                    PathNode.LineTo(96.0f, 156.0f),
                    PathNode.CurveTo(89.37258f, 156.0f, 84.0f, 161.37259f, 84.0f, 168.0f),
                    PathNode.LineTo(84.0f, 220.0f),
                    PathNode.LineTo(72.09f, 220.0f),
                    PathNode.CurveTo(56.12317f, 219.99397f, 41.412613f, 211.33861f, 33.65262f, 197.38432f),
                    PathNode.CurveTo(25.89262f, 183.43004f, 26.301123f, 166.36696f, 34.72f, 152.8f),
                    PathNode.CurveTo(34.73047f, 152.76392f, 34.74741f, 152.73003f, 34.77f, 152.7f),
                    PathNode.LineTo(90.65f, 56.75f),
                    PathNode.CurveTo(98.68297f, 43.850376f, 112.80366f, 36.008923f, 128.0f, 36.008923f),
                    PathNode.CurveTo(143.19635f, 36.008923f, 157.31702f, 43.850376f, 165.35f, 56.75f),
                    PathNode.LineTo(221.23f, 152.7f),
                    PathNode.CurveTo(221.2526f, 152.73003f, 221.26953f, 152.76392f, 221.28f, 152.8f),
                    PathNode.CurveTo(229.8247f, 166.33101f, 230.23586f, 183.46472f, 222.35f, 197.39f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _onigiri!!
    }

private var _onigiri: ImageVector? = null

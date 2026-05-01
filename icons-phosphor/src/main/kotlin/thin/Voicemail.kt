package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Voicemail: ImageVector
    get() {
        if (_voicemail != null) return _voicemail!!
        _voicemail = phosphorThinIcon(
            name = "Voicemail",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 76.0f),
                    PathNode.CurveTo(176.84552f, 76.0235f, 156.49606f, 91.35377f, 150.08546f, 113.60314f),
                    PathNode.CurveTo(143.67487f, 135.85252f, 152.74773f, 159.6601f, 172.34f, 172.0f),
                    PathNode.LineTo(83.66f, 172.0f),
                    PathNode.CurveTo(105.5839f, 158.1915f, 113.997215f, 130.3498f, 103.38937f, 106.71071f),
                    PathNode.CurveTo(92.781525f, 83.07163f, 66.389465f, 70.84856f, 41.499527f, 78.047386f),
                    PathNode.CurveTo(16.609583f, 85.246216f, 0.816831f, 109.67024f, 4.465243f, 135.32217f),
                    PathNode.CurveTo(8.113655f, 160.9741f, 30.089931f, 180.02634f, 56.0f, 180.0f),
                    PathNode.LineTo(200.0f, 180.0f),
                    PathNode.CurveTo(228.71881f, 180.0f, 252.0f, 156.71881f, 252.0f, 128.0f),
                    PathNode.CurveTo(252.0f, 99.2812f, 228.71881f, 76.0f, 200.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(12.0f, 128.0f),
                    PathNode.CurveTo(12.0f, 103.69947f, 31.69947f, 84.0f, 56.0f, 84.0f),
                    PathNode.CurveTo(80.30053f, 84.0f, 100.0f, 103.69947f, 100.0f, 128.0f),
                    PathNode.CurveTo(100.0f, 152.30052f, 80.30053f, 172.0f, 56.0f, 172.0f),
                    PathNode.CurveTo(31.710894f, 171.97244f, 12.027555f, 152.28911f, 12.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 172.0f),
                    PathNode.CurveTo(175.69948f, 172.0f, 156.0f, 152.30052f, 156.0f, 128.0f),
                    PathNode.CurveTo(156.0f, 103.69947f, 175.69948f, 84.0f, 200.0f, 84.0f),
                    PathNode.CurveTo(224.30052f, 84.0f, 244.0f, 103.69947f, 244.0f, 128.0f),
                    PathNode.CurveTo(243.97244f, 152.28911f, 224.28911f, 171.97244f, 200.0f, 172.0f),
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
        return _voicemail!!
    }

private var _voicemail: ImageVector? = null

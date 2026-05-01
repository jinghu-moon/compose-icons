package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NumberSix: ImageVector
    get() {
        if (_numberSix != null) return _numberSix!!
        _numberSix = phosphorThinIcon(
            name = "NumberSix",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 108.0f),
                    PathNode.CurveTo(119.35873f, 107.987946f, 110.85248f, 110.14374f, 103.26f, 114.27f),
                    PathNode.LineTo(139.49f, 50.0f),
                    PathNode.CurveTo(140.57248f, 48.067005f, 139.883f, 45.62248f, 137.95f, 44.54f),
                    PathNode.CurveTo(136.017f, 43.457523f, 133.57248f, 44.147003f, 132.49f, 46.08f),
                    PathNode.LineTo(83.0f, 134.05f),
                    PathNode.CurveTo(71.2547f, 154.44576f, 74.67304f, 180.18756f, 91.33427f, 196.81111f),
                    PathNode.CurveTo(107.99549f, 213.43466f, 133.74498f, 216.79472f, 154.11409f, 205.00327f),
                    PathNode.CurveTo(174.4832f, 193.21182f, 184.39272f, 169.20917f, 178.27448f, 146.48239f),
                    PathNode.CurveTo(172.15623f, 123.75562f, 151.53589f, 107.97186f, 128.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 204.0f),
                    PathNode.CurveTo(103.69947f, 204.0f, 84.0f, 184.30052f, 84.0f, 160.0f),
                    PathNode.CurveTo(84.0f, 135.69948f, 103.69947f, 116.0f, 128.0f, 116.0f),
                    PathNode.CurveTo(152.30052f, 116.0f, 172.0f, 135.69948f, 172.0f, 160.0f),
                    PathNode.CurveTo(171.97244f, 184.28911f, 152.28911f, 203.97244f, 128.0f, 204.0f),
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
        return _numberSix!!
    }

private var _numberSix: ImageVector? = null

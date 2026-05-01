package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.TennisBall: ImageVector
    get() {
        if (_tennisBall != null) return _tennisBall!!
        _tennisBall = phosphorRegularIcon(
            name = "TennisBall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(201.57f, 54.46f),
                    PathNode.CurveTo(160.95522f, 13.846201f, 95.106514f, 13.846735f, 54.492386f, 54.461193f),
                    PathNode.CurveTo(13.878258f, 95.07565f, 13.878258f, 160.92435f, 54.492386f, 201.5388f),
                    PathNode.CurveTo(95.106514f, 242.15326f, 160.95522f, 242.1538f, 201.57f, 201.54f),
                    PathNode.CurveTo(221.22269f, 182.11522f, 232.2828f, 155.6324f, 232.2828f, 128.0f),
                    PathNode.CurveTo(232.2828f, 100.36759f, 221.22269f, 73.88478f, 201.57f, 54.46f),
                    PathNode.Close,
                    PathNode.MoveTo(65.75f, 65.77f),
                    PathNode.CurveTo(80.1497f, 51.350735f, 99.12454f, 42.4008f, 119.41f, 40.46f),
                    PathNode.CurveTo(117.4548f, 60.744576f, 108.4657f, 79.706245f, 94.0f, 94.06f),
                    PathNode.CurveTo(79.62681f, 108.50019f, 60.66129f, 117.466545f, 40.38f, 119.41f),
                    PathNode.CurveTo(42.337505f, 99.12265f, 51.30942f, 80.15326f, 65.75f, 65.77f),
                    PathNode.Close,
                    PathNode.MoveTo(40.33f, 135.48f),
                    PathNode.CurveTo(64.894775f, 133.51854f, 87.948875f, 122.83917f, 105.33f, 105.37f),
                    PathNode.CurveTo(122.81019f, 87.99446f, 133.49748f, 64.938576f, 135.46f, 40.37f),
                    PathNode.CurveTo(178.16557f, 43.930344f, 212.05835f, 77.806206f, 215.64f, 120.51f),
                    PathNode.CurveTo(164.92676f, 124.66269f, 124.66467f, 164.89938f, 120.48f, 215.61f),
                    PathNode.CurveTo(77.77443f, 212.04965f, 43.881653f, 178.1738f, 40.3f, 135.47f),
                    PathNode.Close,
                    PathNode.MoveTo(190.25f, 190.23f),
                    PathNode.CurveTo(175.84738f, 204.64508f, 156.8741f, 213.59428f, 136.59f, 215.54f),
                    PathNode.CurveTo(140.70934f, 173.74327f, 173.79066f, 140.68288f, 215.59f, 136.59f),
                    PathNode.CurveTo(213.64064f, 156.87343f, 204.67957f, 175.84233f, 190.25f, 190.23f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _tennisBall!!
    }

private var _tennisBall: ImageVector? = null

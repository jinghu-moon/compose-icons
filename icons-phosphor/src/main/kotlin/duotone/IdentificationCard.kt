package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.IdentificationCard: ImageVector
    get() {
        if (_identificationCard != null) return _identificationCard!!
        _identificationCard = phosphorDuotoneIcon(
            name = "IdentificationCard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 48.0f),
                    PathNode.LineTo(40.0f, 48.0f),
                    PathNode.CurveTo(35.581722f, 48.0f, 32.0f, 51.581722f, 32.0f, 56.0f),
                    PathNode.LineTo(32.0f, 200.0f),
                    PathNode.CurveTo(32.0f, 204.41827f, 35.581722f, 208.0f, 40.0f, 208.0f),
                    PathNode.LineTo(216.0f, 208.0f),
                    PathNode.CurveTo(220.41827f, 208.0f, 224.0f, 204.41827f, 224.0f, 200.0f),
                    PathNode.LineTo(224.0f, 56.0f),
                    PathNode.CurveTo(224.0f, 51.581722f, 220.41827f, 48.0f, 216.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 144.0f),
                    PathNode.CurveTo(82.74516f, 144.0f, 72.0f, 133.25484f, 72.0f, 120.0f),
                    PathNode.CurveTo(72.0f, 106.74516f, 82.74516f, 96.0f, 96.0f, 96.0f),
                    PathNode.CurveTo(109.25484f, 96.0f, 120.0f, 106.74516f, 120.0f, 120.0f),
                    PathNode.CurveTo(120.0f, 133.25484f, 109.25484f, 144.0f, 96.0f, 144.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 112.0f),
                    PathNode.CurveTo(200.0f, 116.41828f, 196.41827f, 120.0f, 192.0f, 120.0f),
                    PathNode.LineTo(152.0f, 120.0f),
                    PathNode.CurveTo(147.58173f, 120.0f, 144.0f, 116.41828f, 144.0f, 112.0f),
                    PathNode.CurveTo(144.0f, 107.58172f, 147.58173f, 104.0f, 152.0f, 104.0f),
                    PathNode.LineTo(192.0f, 104.0f),
                    PathNode.CurveTo(196.41827f, 104.0f, 200.0f, 107.58172f, 200.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 136.0f),
                    PathNode.LineTo(152.0f, 136.0f),
                    PathNode.CurveTo(147.58173f, 136.0f, 144.0f, 139.58173f, 144.0f, 144.0f),
                    PathNode.CurveTo(144.0f, 148.41827f, 147.58173f, 152.0f, 152.0f, 152.0f),
                    PathNode.LineTo(192.0f, 152.0f),
                    PathNode.CurveTo(196.41827f, 152.0f, 200.0f, 148.41827f, 200.0f, 144.0f),
                    PathNode.CurveTo(200.0f, 139.58173f, 196.41827f, 136.0f, 192.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 56.0f),
                    PathNode.LineTo(232.0f, 200.0f),
                    PathNode.CurveTo(232.0f, 208.83656f, 224.83656f, 216.0f, 216.0f, 216.0f),
                    PathNode.LineTo(40.0f, 216.0f),
                    PathNode.CurveTo(31.163445f, 216.0f, 24.0f, 208.83656f, 24.0f, 200.0f),
                    PathNode.LineTo(24.0f, 56.0f),
                    PathNode.CurveTo(24.0f, 47.163445f, 31.163445f, 40.0f, 40.0f, 40.0f),
                    PathNode.LineTo(216.0f, 40.0f),
                    PathNode.CurveTo(224.83656f, 40.0f, 232.0f, 47.163445f, 232.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 200.0f),
                    PathNode.LineTo(216.0f, 56.0f),
                    PathNode.LineTo(40.0f, 56.0f),
                    PathNode.LineTo(40.0f, 200.0f),
                    PathNode.LineTo(216.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(135.74f, 166.0f),
                    PathNode.CurveTo(136.84457f, 170.28021f, 134.2702f, 174.64543f, 129.99f, 175.75f),
                    PathNode.CurveTo(125.70979f, 176.85457f, 121.34457f, 174.28021f, 120.24f, 170.0f),
                    PathNode.CurveTo(117.61f, 159.74f, 107.18f, 152.0f, 95.99f, 152.0f),
                    PathNode.CurveTo(84.8f, 152.0f, 74.38f, 159.74f, 71.74f, 170.0f),
                    PathNode.CurveTo(70.63543f, 174.28021f, 66.27021f, 176.85457f, 61.99f, 175.75f),
                    PathNode.CurveTo(57.709793f, 174.64543f, 55.13543f, 170.28021f, 56.24f, 166.0f),
                    PathNode.CurveTo(58.836002f, 156.33751f, 64.97255f, 148.00551f, 73.43f, 142.66f),
                    PathNode.CurveTo(64.23859f, 133.52312f, 61.46587f, 119.74444f, 66.40767f, 107.76349f),
                    PathNode.CurveTo(71.34948f, 95.78253f, 83.02988f, 87.96536f, 95.99f, 87.96536f),
                    PathNode.CurveTo(108.95012f, 87.96536f, 120.63052f, 95.78253f, 125.57233f, 107.76349f),
                    PathNode.CurveTo(130.51413f, 119.74444f, 127.74141f, 133.52312f, 118.55f, 142.66f),
                    PathNode.CurveTo(127.01667f, 147.9978f, 133.15874f, 156.33243f, 135.75f, 166.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 136.0f),
                    PathNode.CurveTo(104.836555f, 136.0f, 112.0f, 128.83656f, 112.0f, 120.0f),
                    PathNode.CurveTo(112.0f, 111.163445f, 104.836555f, 104.0f, 96.0f, 104.0f),
                    PathNode.CurveTo(87.163445f, 104.0f, 80.0f, 111.163445f, 80.0f, 120.0f),
                    PathNode.CurveTo(80.0f, 128.83656f, 87.163445f, 136.0f, 96.0f, 136.0f),
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
        return _identificationCard!!
    }

private var _identificationCard: ImageVector? = null

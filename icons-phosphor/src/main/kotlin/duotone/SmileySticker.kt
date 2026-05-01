package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.SmileySticker: ImageVector
    get() {
        if (_smileySticker != null) return _smileySticker!!
        _smileySticker = phosphorDuotoneIcon(
            name = "SmileySticker",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 128.0f),
                    PathNode.CurveTo(224.01054f, 137.56061f, 222.59152f, 147.06906f, 219.79f, 156.21f),
                    PathNode.LineTo(156.22f, 219.79f),
                    PathNode.CurveTo(116.60403f, 231.97374f, 73.6419f, 217.35706f, 49.67598f, 183.54135f),
                    PathNode.CurveTo(25.710062f, 149.7256f, 26.152437f, 104.34724f, 50.773052f, 71.00516f),
                    PathNode.CurveTo(75.39366f, 37.663082f, 118.63258f, 23.88674f, 158.0035f, 36.840492f),
                    PathNode.CurveTo(197.37442f, 49.794247f, 223.98642f, 86.55282f, 224.0f, 128.0f),
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
                    PathNode.MoveTo(174.92f, 156.0f),
                    PathNode.CurveTo(164.63f, 173.79f, 147.53f, 184.0f, 128.0f, 184.0f),
                    PathNode.CurveTo(108.47f, 184.0f, 91.37f, 173.8f, 81.08f, 156.0f),
                    PathNode.CurveTo(79.503525f, 153.52008f, 79.413536f, 150.3755f, 80.84562f, 147.8095f),
                    PathNode.CurveTo(82.277695f, 145.24348f, 85.00129f, 143.66916f, 87.9396f, 143.70892f),
                    PathNode.CurveTo(90.87791f, 143.7487f, 93.5579f, 145.39618f, 94.92f, 148.0f),
                    PathNode.CurveTo(102.39f, 160.91f, 114.13f, 168.0f, 128.0f, 168.0f),
                    PathNode.CurveTo(141.87f, 168.0f, 153.61f, 160.9f, 161.08f, 148.0f),
                    PathNode.CurveTo(162.44211f, 145.39618f, 165.12209f, 143.7487f, 168.0604f, 143.70892f),
                    PathNode.CurveTo(170.9987f, 143.66916f, 173.7223f, 145.24348f, 175.15439f, 147.8095f),
                    PathNode.CurveTo(176.58647f, 150.3755f, 176.49648f, 153.52008f, 174.92f, 156.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 128.0f),
                    PathNode.CurveTo(232.00493f, 138.3565f, 230.46808f, 148.65607f, 227.44f, 158.56f),
                    PathNode.CurveTo(227.05406f, 159.81029f, 226.36732f, 160.94684f, 225.44f, 161.87f),
                    PathNode.LineTo(161.87f, 225.44f),
                    PathNode.CurveTo(160.95222f, 226.3692f, 159.8184f, 227.05637f, 158.57f, 227.44f),
                    PathNode.CurveTo(115.65266f, 240.63828f, 69.11081f, 224.80295f, 43.14827f, 188.1691f),
                    PathNode.CurveTo(17.185734f, 151.53523f, 17.66543f, 102.37559f, 44.337894f, 66.25534f),
                    PathNode.CurveTo(71.01036f, 30.135088f, 117.85235f, 15.210996f, 160.50398f, 29.24425f),
                    PathNode.CurveTo(203.1556f, 43.2775f, 231.98515f, 83.09908f, 232.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 128.0f),
                    PathNode.CurveTo(215.95312f, 90.24838f, 191.80318f, 56.743683f, 156.00314f, 44.76269f),
                    PathNode.CurveTo(120.2031f, 32.781704f, 80.750946f, 45.001057f, 57.990288f, 75.119804f),
                    PathNode.CurveTo(35.22963f, 105.23855f, 34.245354f, 146.52798f, 55.545f, 177.69707f),
                    PathNode.CurveTo(76.84464f, 208.86615f, 115.66974f, 222.9515f, 152.0f, 212.69f),
                    PathNode.LineTo(212.69f, 152.0f),
                    PathNode.CurveTo(214.89394f, 144.19073f, 216.00781f, 136.1143f, 216.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 120.0f),
                    PathNode.CurveTo(98.62742f, 120.0f, 104.0f, 114.62742f, 104.0f, 108.0f),
                    PathNode.CurveTo(104.0f, 101.37258f, 98.62742f, 96.0f, 92.0f, 96.0f),
                    PathNode.CurveTo(85.37258f, 96.0f, 80.0f, 101.37258f, 80.0f, 108.0f),
                    PathNode.CurveTo(80.0f, 114.62742f, 85.37258f, 120.0f, 92.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 96.0f),
                    PathNode.CurveTo(157.37259f, 96.0f, 152.0f, 101.37258f, 152.0f, 108.0f),
                    PathNode.CurveTo(152.0f, 114.62742f, 157.37259f, 120.0f, 164.0f, 120.0f),
                    PathNode.CurveTo(170.62741f, 120.0f, 176.0f, 114.62742f, 176.0f, 108.0f),
                    PathNode.CurveTo(176.0f, 101.37258f, 170.62741f, 96.0f, 164.0f, 96.0f),
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
        return _smileySticker!!
    }

private var _smileySticker: ImageVector? = null

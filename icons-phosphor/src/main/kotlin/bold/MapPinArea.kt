package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MapPinArea: ImageVector
    get() {
        if (_mapPinArea != null) return _mapPinArea!!
        _mapPinArea = phosphorBoldIcon(
            name = "MapPinArea",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(108.0f, 80.0f),
                    PathNode.CurveTo(108.0f, 68.95431f, 116.95431f, 60.0f, 128.0f, 60.0f),
                    PathNode.CurveTo(139.0457f, 60.0f, 148.0f, 68.95431f, 148.0f, 80.0f),
                    PathNode.CurveTo(148.0f, 91.04569f, 139.0457f, 100.0f, 128.0f, 100.0f),
                    PathNode.CurveTo(116.95431f, 100.0f, 108.0f, 91.04569f, 108.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(60.0f, 80.0f),
                    PathNode.CurveTo(60.0f, 42.444637f, 90.44463f, 12.0f, 128.0f, 12.0f),
                    PathNode.CurveTo(165.55536f, 12.0f, 196.0f, 42.444637f, 196.0f, 80.0f),
                    PathNode.CurveTo(196.0f, 142.25f, 136.49f, 177.0f, 133.95f, 178.42f),
                    PathNode.CurveTo(130.26268f, 180.52531f, 125.73732f, 180.52531f, 122.05f, 178.42f),
                    PathNode.CurveTo(119.51f, 177.0f, 60.0f, 142.25f, 60.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(84.0f, 80.0f),
                    PathNode.CurveTo(84.0f, 118.2f, 114.71f, 144.2f, 128.0f, 153.64f),
                    PathNode.CurveTo(141.21f, 144.15f, 172.0f, 118.0f, 172.0f, 80.0f),
                    PathNode.CurveTo(172.0f, 55.69947f, 152.30052f, 36.0f, 128.0f, 36.0f),
                    PathNode.CurveTo(103.69947f, 36.0f, 84.0f, 55.69947f, 84.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.57f, 145.6f),
                    PathNode.CurveTo(204.59558f, 143.9136f, 200.0216f, 144.49223f, 196.59233f, 147.1152f),
                    PathNode.CurveTo(193.16306f, 149.73819f, 191.40715f, 154.00114f, 191.99425f, 158.27844f),
                    PathNode.CurveTo(192.5813f, 162.55574f, 195.42084f, 166.18797f, 199.43f, 167.79f),
                    PathNode.CurveTo(213.56f, 173.61f, 220.0f, 180.27f, 220.0f, 184.0f),
                    PathNode.CurveTo(220.0f, 188.0f, 212.87f, 195.07f, 197.23f, 201.08f),
                    PathNode.CurveTo(178.93f, 208.08f, 154.34f, 212.0f, 128.0f, 212.0f),
                    PathNode.CurveTo(101.66f, 212.0f, 77.07f, 208.12f, 58.77f, 201.08f),
                    PathNode.CurveTo(43.12f, 195.07f, 36.0f, 188.0f, 36.0f, 184.0f),
                    PathNode.CurveTo(36.0f, 180.27f, 42.44f, 173.61f, 56.57f, 167.79f),
                    PathNode.CurveTo(60.57917f, 166.18797f, 63.418705f, 162.55574f, 64.005775f, 158.27844f),
                    PathNode.CurveTo(64.59284f, 154.00114f, 62.836945f, 149.73819f, 59.40767f, 147.1152f),
                    PathNode.CurveTo(55.978394f, 144.49223f, 51.404423f, 143.9136f, 47.43f, 145.6f),
                    PathNode.CurveTo(31.27f, 152.25f, 12.0f, 164.31f, 12.0f, 184.0f),
                    PathNode.CurveTo(12.0f, 218.14f, 70.36f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(157.22f, 236.0f, 184.86f, 231.56f, 205.85f, 223.48f),
                    PathNode.CurveTo(220.1f, 218.0f, 244.0f, 205.59f, 244.0f, 184.0f),
                    PathNode.CurveTo(244.0f, 164.31f, 224.73f, 152.25f, 208.57f, 145.6f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _mapPinArea!!
    }

private var _mapPinArea: ImageVector? = null

package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.FunnelX: ImageVector
    get() {
        if (_funnelX != null) return _funnelX!!
        _funnelX = phosphorRegularIcon(
            name = "FunnelX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(227.82f, 66.76f),
                    PathNode.CurveTo(232.07591f, 62.0763f, 233.17128f, 55.324207f, 230.61429f, 49.53528f),
                    PathNode.CurveTo(228.0573f, 43.746353f, 222.32849f, 40.00852f, 216.0f, 40.0f),
                    PathNode.LineTo(40.0f, 40.0f),
                    PathNode.CurveTo(33.67332f, 40.012466f, 27.948126f, 43.751766f, 25.393673f, 49.53984f),
                    PathNode.CurveTo(22.83922f, 55.327915f, 23.935287f, 62.077644f, 28.19f, 66.76f),
                    PathNode.LineTo(28.27f, 66.85f),
                    PathNode.LineTo(96.0f, 139.17f),
                    PathNode.LineTo(96.0f, 216.0f),
                    PathNode.CurveTo(95.99863f, 221.90027f, 99.24462f, 227.32245f, 104.44588f, 230.10817f),
                    PathNode.CurveTo(109.647125f, 232.89388f, 115.9594f, 232.59096f, 120.87f, 229.32f),
                    PathNode.LineTo(152.87f, 207.98f),
                    PathNode.CurveTo(157.32529f, 205.01233f, 160.00125f, 200.01318f, 160.0f, 194.66f),
                    PathNode.LineTo(160.0f, 139.17f),
                    PathNode.LineTo(227.73f, 66.85f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 56.0f),
                    PathNode.LineTo(40.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(146.19f, 130.59f),
                    PathNode.CurveTo(144.80476f, 132.05319f, 144.02266f, 133.98523f, 144.0f, 136.0f),
                    PathNode.LineTo(144.0f, 194.66f),
                    PathNode.LineTo(112.0f, 216.0f),
                    PathNode.LineTo(112.0f, 136.0f),
                    PathNode.CurveTo(111.99808f, 133.97202f, 111.22603f, 132.02043f, 109.84f, 130.54f),
                    PathNode.LineTo(40.0f, 56.0f),
                    PathNode.LineTo(216.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(245.68f, 210.4f),
                    PathNode.CurveTo(248.80594f, 213.52592f, 248.80594f, 218.59407f, 245.68f, 221.72f),
                    PathNode.CurveTo(242.55406f, 224.84593f, 237.48593f, 224.84593f, 234.36f, 221.72f),
                    PathNode.LineTo(216.0f, 203.32f),
                    PathNode.LineTo(197.66f, 221.67f),
                    PathNode.CurveTo(194.53407f, 224.79317f, 189.46817f, 224.79092f, 186.345f, 221.665f),
                    PathNode.CurveTo(183.22185f, 218.53906f, 183.22408f, 213.47318f, 186.35f, 210.35f),
                    PathNode.LineTo(204.69f, 192.0f),
                    PathNode.LineTo(186.35f, 173.65f),
                    PathNode.CurveTo(183.36177f, 170.50468f, 183.4252f, 165.55075f, 186.49297f, 162.48297f),
                    PathNode.CurveTo(189.56075f, 159.41518f, 194.51468f, 159.35178f, 197.66f, 162.34f),
                    PathNode.LineTo(216.0f, 180.69f),
                    PathNode.LineTo(234.34f, 162.35f),
                    PathNode.CurveTo(237.46317f, 159.22408f, 242.52907f, 159.22185f, 245.655f, 162.345f),
                    PathNode.CurveTo(248.78093f, 165.46817f, 248.78317f, 170.53407f, 245.66f, 173.66f),
                    PathNode.LineTo(227.31f, 192.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _funnelX!!
    }

private var _funnelX: ImageVector? = null

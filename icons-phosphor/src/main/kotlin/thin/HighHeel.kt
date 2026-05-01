package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.HighHeel: ImageVector
    get() {
        if (_highHeel != null) return _highHeel!!
        _highHeel = phosphorThinIcon(
            name = "HighHeel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(230.09f, 160.09f),
                    PathNode.LineTo(178.0f, 148.35f),
                    PathNode.LineTo(66.83f, 37.17f),
                    PathNode.CurveTo(66.057304f, 36.39758f, 65.00227f, 35.974846f, 63.91f, 36.0f),
                    PathNode.CurveTo(62.81927f, 36.02516f, 61.786148f, 36.494762f, 61.05f, 37.3f),
                    PathNode.CurveTo(39.74f, 60.6f, 28.0f, 90.0f, 28.0f, 120.0f),
                    PathNode.LineTo(28.0f, 192.0f),
                    PathNode.CurveTo(28.0f, 198.62741f, 33.37258f, 204.0f, 40.0f, 204.0f),
                    PathNode.LineTo(72.0f, 204.0f),
                    PathNode.CurveTo(78.62742f, 204.0f, 84.0f, 198.62741f, 84.0f, 192.0f),
                    PathNode.LineTo(84.0f, 136.36f),
                    PathNode.CurveTo(109.20105f, 149.05734f, 128.94934f, 170.45398f, 139.59f, 196.59f),
                    PathNode.CurveTo(141.43718f, 201.10234f, 145.84435f, 204.03648f, 150.72f, 204.0f),
                    PathNode.LineTo(240.0f, 204.0f),
                    PathNode.CurveTo(246.62741f, 204.0f, 252.0f, 198.62741f, 252.0f, 192.0f),
                    PathNode.LineTo(252.0f, 187.27f),
                    PathNode.CurveTo(252.0281f, 174.174f, 242.89355f, 162.84232f, 230.09f, 160.09f),
                    PathNode.Close,
                    PathNode.MoveTo(76.0f, 192.0f),
                    PathNode.CurveTo(76.0f, 194.20914f, 74.20914f, 196.0f, 72.0f, 196.0f),
                    PathNode.LineTo(40.0f, 196.0f),
                    PathNode.CurveTo(37.79086f, 196.0f, 36.0f, 194.20914f, 36.0f, 192.0f),
                    PathNode.LineTo(36.0f, 124.08f),
                    PathNode.CurveTo(49.741688f, 124.53693f, 63.28981f, 127.45655f, 76.0f, 132.7f),
                    PathNode.Close,
                    PathNode.MoveTo(244.0f, 192.0f),
                    PathNode.CurveTo(244.0f, 194.20914f, 242.20914f, 196.0f, 240.0f, 196.0f),
                    PathNode.LineTo(150.72f, 196.0f),
                    PathNode.CurveTo(149.1088f, 196.01418f, 147.6464f, 195.06026f, 147.01f, 193.58f),
                    PathNode.CurveTo(137.84053f, 170.998f, 122.23757f, 151.60817f, 102.14f, 137.82f),
                    PathNode.CurveTo(82.66552f, 124.3692f, 59.72629f, 116.817696f, 36.07f, 116.07f),
                    PathNode.CurveTo(37.0f, 90.74f, 46.87f, 66.07f, 64.18f, 45.84f),
                    PathNode.LineTo(173.18f, 154.84f),
                    PathNode.CurveTo(173.72946f, 155.38217f, 174.42406f, 155.7538f, 175.18f, 155.91f),
                    PathNode.LineTo(228.4f, 167.91f),
                    PathNode.CurveTo(237.52544f, 169.88684f, 244.02766f, 177.97295f, 244.0f, 187.31f),
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
        return _highHeel!!
    }

private var _highHeel: ImageVector? = null

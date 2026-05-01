package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Bug: ImageVector
    get() {
        if (_bug != null) return _bug!!
        _bug = phosphorThinIcon(
            name = "Bug",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(148.0f, 92.0f),
                    PathNode.CurveTo(148.0f, 87.58172f, 151.58173f, 84.0f, 156.0f, 84.0f),
                    PathNode.CurveTo(160.41827f, 84.0f, 164.0f, 87.58172f, 164.0f, 92.0f),
                    PathNode.CurveTo(164.0f, 96.41828f, 160.41827f, 100.0f, 156.0f, 100.0f),
                    PathNode.CurveTo(151.58173f, 100.0f, 148.0f, 96.41828f, 148.0f, 92.0f),
                    PathNode.Close,
                    PathNode.MoveTo(100.0f, 84.0f),
                    PathNode.CurveTo(95.58172f, 84.0f, 92.0f, 87.58172f, 92.0f, 92.0f),
                    PathNode.CurveTo(92.0f, 96.41828f, 95.58172f, 100.0f, 100.0f, 100.0f),
                    PathNode.CurveTo(104.41828f, 100.0f, 108.0f, 96.41828f, 108.0f, 92.0f),
                    PathNode.CurveTo(108.0f, 87.58172f, 104.41828f, 84.0f, 100.0f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(244.0f, 128.0f),
                    PathNode.CurveTo(244.0f, 130.20914f, 242.20914f, 132.0f, 240.0f, 132.0f),
                    PathNode.LineTo(212.0f, 132.0f),
                    PathNode.LineTo(212.0f, 144.0f),
                    PathNode.CurveTo(212.00536f, 152.54842f, 210.7002f, 161.04712f, 208.13f, 169.2f),
                    PathNode.LineTo(233.6f, 180.33f),
                    PathNode.CurveTo(235.34117f, 181.08478f, 236.31232f, 182.95912f, 235.92479f, 184.81685f),
                    PathNode.CurveTo(235.53726f, 186.67458f, 233.89774f, 188.0043f, 232.0f, 188.0f),
                    PathNode.CurveTo(231.4499f, 187.99872f, 230.90572f, 187.88647f, 230.4f, 187.67f),
                    PathNode.LineTo(205.4f, 176.72f),
                    PathNode.CurveTo(192.25111f, 207.79588f, 161.7832f, 227.98729f, 128.04f, 227.98729f),
                    PathNode.CurveTo(94.2968f, 227.98729f, 63.828884f, 207.79588f, 50.68f, 176.72f),
                    PathNode.LineTo(25.68f, 187.67f),
                    PathNode.CurveTo(25.149553f, 187.8973f, 24.57701f, 188.00975f, 24.0f, 188.0f),
                    PathNode.CurveTo(22.102283f, 188.0043f, 20.462742f, 186.67458f, 20.07521f, 184.81685f),
                    PathNode.CurveTo(19.687677f, 182.95912f, 20.658836f, 181.08478f, 22.4f, 180.33f),
                    PathNode.LineTo(47.87f, 169.2f),
                    PathNode.CurveTo(45.2998f, 161.04712f, 43.99464f, 152.54842f, 44.0f, 144.0f),
                    PathNode.LineTo(44.0f, 132.0f),
                    PathNode.LineTo(16.0f, 132.0f),
                    PathNode.CurveTo(13.790861f, 132.0f, 12.0f, 130.20914f, 12.0f, 128.0f),
                    PathNode.CurveTo(12.0f, 125.79086f, 13.790861f, 124.0f, 16.0f, 124.0f),
                    PathNode.LineTo(44.0f, 124.0f),
                    PathNode.LineTo(44.0f, 112.0f),
                    PathNode.CurveTo(43.99464f, 103.45159f, 45.2998f, 94.95288f, 47.87f, 86.8f),
                    PathNode.LineTo(22.4f, 75.67f),
                    PathNode.CurveTo(20.373116f, 74.78635f, 19.446344f, 72.42689f, 20.33f, 70.4f),
                    PathNode.CurveTo(21.213655f, 68.373116f, 23.573114f, 67.44634f, 25.6f, 68.33f),
                    PathNode.LineTo(50.6f, 79.33f),
                    PathNode.CurveTo(63.748886f, 48.25412f, 94.216805f, 28.062712f, 127.96f, 28.062712f),
                    PathNode.CurveTo(161.7032f, 28.062712f, 192.17113f, 48.25412f, 205.32f, 79.33f),
                    PathNode.LineTo(230.32f, 68.33f),
                    PathNode.CurveTo(232.34688f, 67.44634f, 234.70634f, 68.373116f, 235.59f, 70.4f),
                    PathNode.CurveTo(236.47365f, 72.42689f, 235.54689f, 74.78635f, 233.52f, 75.67f),
                    PathNode.LineTo(208.13f, 86.8f),
                    PathNode.CurveTo(210.7002f, 94.95288f, 212.00536f, 103.45159f, 212.0f, 112.0f),
                    PathNode.LineTo(212.0f, 124.0f),
                    PathNode.LineTo(240.0f, 124.0f),
                    PathNode.CurveTo(242.20914f, 124.0f, 244.0f, 125.79086f, 244.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(52.0f, 124.0f),
                    PathNode.LineTo(204.0f, 124.0f),
                    PathNode.LineTo(204.0f, 112.0f),
                    PathNode.CurveTo(204.0f, 70.02636f, 169.97365f, 36.0f, 128.0f, 36.0f),
                    PathNode.CurveTo(86.02636f, 36.0f, 52.0f, 70.02636f, 52.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(124.0f, 219.89f),
                    PathNode.LineTo(124.0f, 132.0f),
                    PathNode.LineTo(52.0f, 132.0f),
                    PathNode.LineTo(52.0f, 144.0f),
                    PathNode.CurveTo(52.047787f, 184.39932f, 83.65906f, 217.71848f, 124.0f, 219.89f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 132.0f),
                    PathNode.LineTo(132.0f, 132.0f),
                    PathNode.LineTo(132.0f, 219.89f),
                    PathNode.CurveTo(172.34094f, 217.71848f, 203.95221f, 184.39932f, 204.0f, 144.0f),
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
        return _bug!!
    }

private var _bug: ImageVector? = null

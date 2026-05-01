package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Flask: ImageVector
    get() {
        if (_flask != null) return _flask!!
        _flask = phosphorThinIcon(
            name = "Flask",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(218.27f, 201.83f),
                    PathNode.LineTo(156.0f, 98.0f),
                    PathNode.LineTo(156.0f, 36.0f),
                    PathNode.LineTo(168.0f, 36.0f),
                    PathNode.CurveTo(170.20914f, 36.0f, 172.0f, 34.20914f, 172.0f, 32.0f),
                    PathNode.CurveTo(172.0f, 29.790861f, 170.20914f, 28.0f, 168.0f, 28.0f),
                    PathNode.LineTo(88.0f, 28.0f),
                    PathNode.CurveTo(85.79086f, 28.0f, 84.0f, 29.790861f, 84.0f, 32.0f),
                    PathNode.CurveTo(84.0f, 34.20914f, 85.79086f, 36.0f, 88.0f, 36.0f),
                    PathNode.LineTo(100.0f, 36.0f),
                    PathNode.LineTo(100.0f, 98.0f),
                    PathNode.LineTo(37.73f, 201.83f),
                    PathNode.CurveTo(35.509583f, 205.5339f, 35.450584f, 210.14522f, 37.575516f, 213.90471f),
                    PathNode.CurveTo(39.700447f, 217.66418f, 43.681545f, 219.99199f, 48.0f, 220.0f),
                    PathNode.LineTo(208.0f, 220.0f),
                    PathNode.CurveTo(212.32204f, 219.99919f, 216.30972f, 217.67422f, 218.43954f, 213.91339f),
                    PathNode.CurveTo(220.56937f, 210.15257f, 220.51224f, 205.53697f, 218.29f, 201.83f),
                    PathNode.Close,
                    PathNode.MoveTo(107.43f, 101.2f),
                    PathNode.CurveTo(107.80013f, 100.57638f, 107.99692f, 99.86519f, 108.0f, 99.14f),
                    PathNode.LineTo(108.0f, 36.0f),
                    PathNode.LineTo(148.0f, 36.0f),
                    PathNode.LineTo(148.0f, 99.14f),
                    PathNode.CurveTo(148.00308f, 99.86519f, 148.19987f, 100.57638f, 148.57f, 101.2f),
                    PathNode.LineTo(189.57f, 169.53f),
                    PathNode.CurveTo(176.81f, 173.47f, 157.03f, 174.21f, 129.82f, 160.43f),
                    PathNode.CurveTo(111.82f, 151.29f, 94.82f, 147.19f, 79.28f, 148.14f),
                    PathNode.Close,
                    PathNode.MoveTo(211.46f, 210.0f),
                    PathNode.CurveTo(210.75197f, 211.25185f, 209.41809f, 212.01845f, 207.98f, 212.0f),
                    PathNode.LineTo(48.0f, 212.0f),
                    PathNode.CurveTo(46.55827f, 212.00044f, 45.22785f, 211.225f, 44.517685f, 209.9703f),
                    PathNode.CurveTo(43.80752f, 208.71562f, 43.827507f, 207.17584f, 44.57f, 205.94f),
                    PathNode.LineTo(74.1f, 156.73f),
                    PathNode.CurveTo(89.64f, 154.3f, 107.15f, 157.94f, 126.17f, 167.57f),
                    PathNode.CurveTo(144.54f, 176.86f, 160.0f, 180.0f, 172.42f, 180.0f),
                    PathNode.CurveTo(179.68329f, 180.04822f, 186.90334f, 178.87868f, 193.78f, 176.54f),
                    PathNode.LineTo(211.41f, 205.92f),
                    PathNode.CurveTo(212.18895f, 207.16347f, 212.20824f, 208.73782f, 211.46f, 210.0f),
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
        return _flask!!
    }

private var _flask: ImageVector? = null

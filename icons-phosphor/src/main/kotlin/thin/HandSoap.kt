package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.HandSoap: ImageVector
    get() {
        if (_handSoap != null) return _handSoap!!
        _handSoap = phosphorThinIcon(
            name = "HandSoap",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(180.0f, 100.23f),
                    PathNode.LineTo(180.0f, 88.0f),
                    PathNode.CurveTo(180.0f, 72.536026f, 167.46397f, 60.0f, 152.0f, 60.0f),
                    PathNode.LineTo(132.0f, 60.0f),
                    PathNode.LineTo(132.0f, 28.0f),
                    PathNode.LineTo(168.0f, 28.0f),
                    PathNode.CurveTo(174.62741f, 28.0f, 180.0f, 33.37258f, 180.0f, 40.0f),
                    PathNode.CurveTo(180.0f, 42.20914f, 181.79086f, 44.0f, 184.0f, 44.0f),
                    PathNode.CurveTo(186.20914f, 44.0f, 188.0f, 42.20914f, 188.0f, 40.0f),
                    PathNode.CurveTo(188.0f, 28.954306f, 179.0457f, 20.0f, 168.0f, 20.0f),
                    PathNode.LineTo(104.0f, 20.0f),
                    PathNode.CurveTo(101.79086f, 20.0f, 100.0f, 21.790861f, 100.0f, 24.0f),
                    PathNode.CurveTo(100.0f, 26.209139f, 101.79086f, 28.0f, 104.0f, 28.0f),
                    PathNode.LineTo(124.0f, 28.0f),
                    PathNode.LineTo(124.0f, 60.0f),
                    PathNode.LineTo(104.0f, 60.0f),
                    PathNode.CurveTo(88.536026f, 60.0f, 76.0f, 72.536026f, 76.0f, 88.0f),
                    PathNode.LineTo(76.0f, 100.23f),
                    PathNode.CurveTo(57.78185f, 102.26685f, 44.00361f, 117.668335f, 44.0f, 136.0f),
                    PathNode.LineTo(44.0f, 216.0f),
                    PathNode.CurveTo(44.0f, 222.62741f, 49.37258f, 228.0f, 56.0f, 228.0f),
                    PathNode.LineTo(200.0f, 228.0f),
                    PathNode.CurveTo(206.62741f, 228.0f, 212.0f, 222.62741f, 212.0f, 216.0f),
                    PathNode.LineTo(212.0f, 136.0f),
                    PathNode.CurveTo(211.99638f, 117.668335f, 198.21815f, 102.26685f, 180.0f, 100.23f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 68.0f),
                    PathNode.LineTo(152.0f, 68.0f),
                    PathNode.CurveTo(163.0457f, 68.0f, 172.0f, 76.95431f, 172.0f, 88.0f),
                    PathNode.LineTo(172.0f, 100.0f),
                    PathNode.LineTo(84.0f, 100.0f),
                    PathNode.LineTo(84.0f, 88.0f),
                    PathNode.CurveTo(84.0f, 76.95431f, 92.95431f, 68.0f, 104.0f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 216.0f),
                    PathNode.CurveTo(204.0f, 218.20914f, 202.20914f, 220.0f, 200.0f, 220.0f),
                    PathNode.LineTo(56.0f, 220.0f),
                    PathNode.CurveTo(53.79086f, 220.0f, 52.0f, 218.20914f, 52.0f, 216.0f),
                    PathNode.LineTo(52.0f, 136.0f),
                    PathNode.CurveTo(52.0f, 120.536026f, 64.536026f, 108.0f, 80.0f, 108.0f),
                    PathNode.LineTo(176.0f, 108.0f),
                    PathNode.CurveTo(191.46397f, 108.0f, 204.0f, 120.536026f, 204.0f, 136.0f),
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
        return _handSoap!!
    }

private var _handSoap: ImageVector? = null

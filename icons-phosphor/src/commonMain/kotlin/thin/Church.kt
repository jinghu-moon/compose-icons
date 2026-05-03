package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Church: ImageVector
    get() {
        if (_church != null) return _church!!
        _church = phosphorThinIcon(
            name = "Church",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(226.06f, 148.57f),
                    PathNode.LineTo(188.0f, 125.74f),
                    PathNode.LineTo(188.0f, 104.0f),
                    PathNode.CurveTo(188.0021f, 102.56883f, 187.23943f, 101.24558f, 186.0f, 100.53f),
                    PathNode.LineTo(132.0f, 69.68f),
                    PathNode.LineTo(132.0f, 44.0f),
                    PathNode.LineTo(152.0f, 44.0f),
                    PathNode.CurveTo(154.20914f, 44.0f, 156.0f, 42.20914f, 156.0f, 40.0f),
                    PathNode.CurveTo(156.0f, 37.79086f, 154.20914f, 36.0f, 152.0f, 36.0f),
                    PathNode.LineTo(132.0f, 36.0f),
                    PathNode.LineTo(132.0f, 16.0f),
                    PathNode.CurveTo(132.0f, 13.790861f, 130.20914f, 12.0f, 128.0f, 12.0f),
                    PathNode.CurveTo(125.79086f, 12.0f, 124.0f, 13.790861f, 124.0f, 16.0f),
                    PathNode.LineTo(124.0f, 36.0f),
                    PathNode.LineTo(104.0f, 36.0f),
                    PathNode.CurveTo(101.79086f, 36.0f, 100.0f, 37.79086f, 100.0f, 40.0f),
                    PathNode.CurveTo(100.0f, 42.20914f, 101.79086f, 44.0f, 104.0f, 44.0f),
                    PathNode.LineTo(124.0f, 44.0f),
                    PathNode.LineTo(124.0f, 69.68f),
                    PathNode.LineTo(70.0f, 100.53f),
                    PathNode.CurveTo(68.76057f, 101.24558f, 67.997894f, 102.56883f, 68.0f, 104.0f),
                    PathNode.LineTo(68.0f, 125.74f),
                    PathNode.LineTo(29.94f, 148.57f),
                    PathNode.CurveTo(28.735945f, 149.2934f, 27.999565f, 150.59537f, 28.0f, 152.0f),
                    PathNode.LineTo(28.0f, 216.0f),
                    PathNode.CurveTo(28.0f, 218.20914f, 29.790861f, 220.0f, 32.0f, 220.0f),
                    PathNode.LineTo(112.0f, 220.0f),
                    PathNode.CurveTo(114.20914f, 220.0f, 116.0f, 218.20914f, 116.0f, 216.0f),
                    PathNode.LineTo(116.0f, 168.0f),
                    PathNode.CurveTo(116.0f, 161.37259f, 121.37258f, 156.0f, 128.0f, 156.0f),
                    PathNode.CurveTo(134.62741f, 156.0f, 140.0f, 161.37259f, 140.0f, 168.0f),
                    PathNode.LineTo(140.0f, 216.0f),
                    PathNode.CurveTo(140.0f, 218.20914f, 141.79086f, 220.0f, 144.0f, 220.0f),
                    PathNode.LineTo(224.0f, 220.0f),
                    PathNode.CurveTo(226.20914f, 220.0f, 228.0f, 218.20914f, 228.0f, 216.0f),
                    PathNode.LineTo(228.0f, 152.0f),
                    PathNode.CurveTo(228.00044f, 150.59537f, 227.26405f, 149.2934f, 226.06f, 148.57f),
                    PathNode.Close,
                    PathNode.MoveTo(36.0f, 154.26f),
                    PathNode.LineTo(68.0f, 135.06f),
                    PathNode.LineTo(68.0f, 212.0f),
                    PathNode.LineTo(36.0f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 148.0f),
                    PathNode.CurveTo(116.95431f, 148.0f, 108.0f, 156.9543f, 108.0f, 168.0f),
                    PathNode.LineTo(108.0f, 212.0f),
                    PathNode.LineTo(76.0f, 212.0f),
                    PathNode.LineTo(76.0f, 106.32f),
                    PathNode.LineTo(128.0f, 76.61f),
                    PathNode.LineTo(180.0f, 106.32f),
                    PathNode.LineTo(180.0f, 212.0f),
                    PathNode.LineTo(148.0f, 212.0f),
                    PathNode.LineTo(148.0f, 168.0f),
                    PathNode.CurveTo(148.0f, 156.9543f, 139.0457f, 148.0f, 128.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 212.0f),
                    PathNode.LineTo(188.0f, 212.0f),
                    PathNode.LineTo(188.0f, 135.06f),
                    PathNode.LineTo(220.0f, 154.26f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _church!!
    }

private var _church: ImageVector? = null

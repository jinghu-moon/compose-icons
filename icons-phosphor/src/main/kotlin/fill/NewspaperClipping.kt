package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.NewspaperClipping: ImageVector
    get() {
        if (_newspaperClipping != null) return _newspaperClipping!!
        _newspaperClipping = phosphorFillIcon(
            name = "NewspaperClipping",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 40.0f),
                    PathNode.LineTo(40.0f, 40.0f),
                    PathNode.CurveTo(31.163445f, 40.0f, 24.0f, 47.163445f, 24.0f, 56.0f),
                    PathNode.LineTo(24.0f, 216.0f),
                    PathNode.CurveTo(24.00148f, 218.77232f, 25.438162f, 221.34625f, 27.797056f, 222.80273f),
                    PathNode.CurveTo(30.155952f, 224.25922f, 33.10076f, 224.39061f, 35.58f, 223.15f),
                    PathNode.LineTo(64.0f, 208.94f),
                    PathNode.LineTo(92.42f, 223.15f),
                    PathNode.CurveTo(94.67347f, 224.27763f, 97.32653f, 224.27763f, 99.58f, 223.15f),
                    PathNode.LineTo(128.0f, 208.94f),
                    PathNode.LineTo(156.42f, 223.15f),
                    PathNode.CurveTo(158.67348f, 224.27763f, 161.32652f, 224.27763f, 163.58f, 223.15f),
                    PathNode.LineTo(192.0f, 208.94f),
                    PathNode.LineTo(220.42f, 223.15f),
                    PathNode.CurveTo(222.89923f, 224.39061f, 225.84402f, 224.25922f, 228.20294f, 222.80273f),
                    PathNode.CurveTo(230.56184f, 221.34625f, 231.9985f, 218.77232f, 232.0f, 216.0f),
                    PathNode.LineTo(232.0f, 56.0f),
                    PathNode.CurveTo(232.0f, 47.163445f, 224.83656f, 40.0f, 216.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(116.0f, 160.0f),
                    PathNode.CurveTo(116.0f, 162.20914f, 114.20914f, 164.0f, 112.0f, 164.0f),
                    PathNode.LineTo(64.0f, 164.0f),
                    PathNode.CurveTo(61.79086f, 164.0f, 60.0f, 162.20914f, 60.0f, 160.0f),
                    PathNode.LineTo(60.0f, 96.0f),
                    PathNode.CurveTo(60.0f, 93.79086f, 61.79086f, 92.0f, 64.0f, 92.0f),
                    PathNode.LineTo(112.0f, 92.0f),
                    PathNode.CurveTo(114.20914f, 92.0f, 116.0f, 93.79086f, 116.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 152.0f),
                    PathNode.LineTo(144.0f, 152.0f),
                    PathNode.CurveTo(139.58173f, 152.0f, 136.0f, 148.41827f, 136.0f, 144.0f),
                    PathNode.CurveTo(136.0f, 139.58173f, 139.58173f, 136.0f, 144.0f, 136.0f),
                    PathNode.LineTo(192.0f, 136.0f),
                    PathNode.CurveTo(196.41827f, 136.0f, 200.0f, 139.58173f, 200.0f, 144.0f),
                    PathNode.CurveTo(200.0f, 148.41827f, 196.41827f, 152.0f, 192.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 120.0f),
                    PathNode.LineTo(144.0f, 120.0f),
                    PathNode.CurveTo(139.58173f, 120.0f, 136.0f, 116.41828f, 136.0f, 112.0f),
                    PathNode.CurveTo(136.0f, 107.58172f, 139.58173f, 104.0f, 144.0f, 104.0f),
                    PathNode.LineTo(192.0f, 104.0f),
                    PathNode.CurveTo(196.41827f, 104.0f, 200.0f, 107.58172f, 200.0f, 112.0f),
                    PathNode.CurveTo(200.0f, 116.41828f, 196.41827f, 120.0f, 192.0f, 120.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _newspaperClipping!!
    }

private var _newspaperClipping: ImageVector? = null

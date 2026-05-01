package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Receipt: ImageVector
    get() {
        if (_receipt != null) return _receipt!!
        _receipt = phosphorFillIcon(
            name = "Receipt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 40.0f),
                    PathNode.LineTo(40.0f, 40.0f),
                    PathNode.CurveTo(31.163445f, 40.0f, 24.0f, 47.163445f, 24.0f, 56.0f),
                    PathNode.LineTo(24.0f, 208.0f),
                    PathNode.CurveTo(24.00148f, 210.77232f, 25.438162f, 213.34625f, 27.797056f, 214.80273f),
                    PathNode.CurveTo(30.155952f, 216.25922f, 33.10076f, 216.39061f, 35.58f, 215.15f),
                    PathNode.LineTo(64.0f, 200.94f),
                    PathNode.LineTo(92.42f, 215.15f),
                    PathNode.CurveTo(94.67347f, 216.27763f, 97.32653f, 216.27763f, 99.58f, 215.15f),
                    PathNode.LineTo(128.0f, 200.94f),
                    PathNode.LineTo(156.42f, 215.15f),
                    PathNode.CurveTo(158.67348f, 216.27763f, 161.32652f, 216.27763f, 163.58f, 215.15f),
                    PathNode.LineTo(192.0f, 200.94f),
                    PathNode.LineTo(220.42f, 215.15f),
                    PathNode.CurveTo(222.89923f, 216.39061f, 225.84402f, 216.25922f, 228.20294f, 214.80273f),
                    PathNode.CurveTo(230.56184f, 213.34625f, 231.9985f, 210.77232f, 232.0f, 208.0f),
                    PathNode.LineTo(232.0f, 56.0f),
                    PathNode.CurveTo(232.0f, 47.163445f, 224.83656f, 40.0f, 216.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 144.0f),
                    PathNode.LineTo(80.0f, 144.0f),
                    PathNode.CurveTo(75.58172f, 144.0f, 72.0f, 140.41827f, 72.0f, 136.0f),
                    PathNode.CurveTo(72.0f, 131.58173f, 75.58172f, 128.0f, 80.0f, 128.0f),
                    PathNode.LineTo(176.0f, 128.0f),
                    PathNode.CurveTo(180.41827f, 128.0f, 184.0f, 131.58173f, 184.0f, 136.0f),
                    PathNode.CurveTo(184.0f, 140.41827f, 180.41827f, 144.0f, 176.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 112.0f),
                    PathNode.LineTo(80.0f, 112.0f),
                    PathNode.CurveTo(75.58172f, 112.0f, 72.0f, 108.41828f, 72.0f, 104.0f),
                    PathNode.CurveTo(72.0f, 99.58172f, 75.58172f, 96.0f, 80.0f, 96.0f),
                    PathNode.LineTo(176.0f, 96.0f),
                    PathNode.CurveTo(180.41827f, 96.0f, 184.0f, 99.58172f, 184.0f, 104.0f),
                    PathNode.CurveTo(184.0f, 108.41828f, 180.41827f, 112.0f, 176.0f, 112.0f),
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
        return _receipt!!
    }

private var _receipt: ImageVector? = null

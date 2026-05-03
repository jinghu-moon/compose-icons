package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Question: ImageVector
    get() {
        if (_question != null) return _question!!
        _question = phosphorFillIcon(
            name = "Question",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 24.0f),
                    PathNode.CurveTo(70.562386f, 24.0f, 24.0f, 70.562386f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 185.4376f, 70.562386f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(185.4376f, 232.0f, 232.0f, 185.4376f, 232.0f, 128.0f),
                    PathNode.CurveTo(231.93938f, 70.58752f, 185.41248f, 24.060629f, 128.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 192.0f),
                    PathNode.CurveTo(121.37258f, 192.0f, 116.0f, 186.62741f, 116.0f, 180.0f),
                    PathNode.CurveTo(116.0f, 173.37259f, 121.37258f, 168.0f, 128.0f, 168.0f),
                    PathNode.CurveTo(134.62741f, 168.0f, 140.0f, 173.37259f, 140.0f, 180.0f),
                    PathNode.CurveTo(140.0f, 186.62741f, 134.62741f, 192.0f, 128.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 143.28f),
                    PathNode.LineTo(136.0f, 144.0f),
                    PathNode.CurveTo(136.0f, 148.41827f, 132.41827f, 152.0f, 128.0f, 152.0f),
                    PathNode.CurveTo(123.58172f, 152.0f, 120.0f, 148.41827f, 120.0f, 144.0f),
                    PathNode.LineTo(120.0f, 136.0f),
                    PathNode.CurveTo(120.0f, 131.58173f, 123.58172f, 128.0f, 128.0f, 128.0f),
                    PathNode.CurveTo(141.23f, 128.0f, 152.0f, 119.0f, 152.0f, 108.0f),
                    PathNode.CurveTo(152.0f, 97.0f, 141.23f, 88.0f, 128.0f, 88.0f),
                    PathNode.CurveTo(114.77f, 88.0f, 104.0f, 97.0f, 104.0f, 108.0f),
                    PathNode.LineTo(104.0f, 112.0f),
                    PathNode.CurveTo(104.0f, 116.41828f, 100.41828f, 120.0f, 96.0f, 120.0f),
                    PathNode.CurveTo(91.58172f, 120.0f, 88.0f, 116.41828f, 88.0f, 112.0f),
                    PathNode.LineTo(88.0f, 108.0f),
                    PathNode.CurveTo(88.0f, 88.15f, 105.94f, 72.0f, 128.0f, 72.0f),
                    PathNode.CurveTo(150.06f, 72.0f, 168.0f, 88.15f, 168.0f, 108.0f),
                    PathNode.CurveTo(168.0f, 125.38f, 154.24f, 139.93f, 136.0f, 143.28f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _question!!
    }

private var _question: ImageVector? = null

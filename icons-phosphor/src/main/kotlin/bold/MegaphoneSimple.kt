package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MegaphoneSimple: ImageVector
    get() {
        if (_megaphoneSimple != null) return _megaphoneSimple!!
        _megaphoneSimple = phosphorBoldIcon(
            name = "MegaphoneSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(229.7f, 82.84f),
                    PathNode.LineTo(53.76f, 28.84f),
                    PathNode.LineTo(53.6f, 28.79f),
                    PathNode.CurveTo(47.55497f, 27.026867f, 41.032578f, 28.213596f, 35.996f, 31.993f),
                    PathNode.CurveTo(30.959417f, 35.772404f, 27.99685f, 41.703094f, 28.0f, 48.0f),
                    PathNode.LineTo(28.0f, 192.0f),
                    PathNode.CurveTo(27.99995f, 203.02231f, 36.917744f, 211.96693f, 47.94f, 212.0f),
                    PathNode.CurveTo(49.855354f, 211.99731f, 51.76077f, 211.72462f, 53.6f, 211.19f),
                    PathNode.LineTo(53.76f, 211.19f),
                    PathNode.LineTo(132.0f, 187.19f),
                    PathNode.LineTo(132.0f, 196.0f),
                    PathNode.CurveTo(132.0f, 207.0457f, 140.9543f, 216.0f, 152.0f, 216.0f),
                    PathNode.LineTo(184.0f, 216.0f),
                    PathNode.CurveTo(195.0457f, 216.0f, 204.0f, 207.0457f, 204.0f, 196.0f),
                    PathNode.LineTo(204.0f, 165.06f),
                    PathNode.LineTo(229.7f, 157.17f),
                    PathNode.CurveTo(238.16327f, 154.61943f, 243.967f, 146.83919f, 244.0f, 138.0f),
                    PathNode.LineTo(244.0f, 102.0f),
                    PathNode.CurveTo(243.9626f, 93.16451f, 238.15974f, 85.38949f, 229.7f, 82.84f),
                    PathNode.Close,
                    PathNode.MoveTo(52.0f, 186.58f),
                    PathNode.LineTo(52.0f, 53.43f),
                    PathNode.LineTo(132.0f, 78.0f),
                    PathNode.LineTo(132.0f, 162.0f),
                    PathNode.Close,
                    PathNode.MoveTo(180.0f, 192.0f),
                    PathNode.LineTo(156.0f, 192.0f),
                    PathNode.LineTo(156.0f, 179.78f),
                    PathNode.LineTo(180.0f, 172.42f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 135.05f),
                    PathNode.LineTo(156.0f, 154.68f),
                    PathNode.LineTo(156.0f, 85.33f),
                    PathNode.LineTo(220.0f, 105.0f),
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
        return _megaphoneSimple!!
    }

private var _megaphoneSimple: ImageVector? = null

package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Paragraph: ImageVector
    get() {
        if (_paragraph != null) return _paragraph!!
        _paragraph = phosphorBoldIcon(
            name = "Paragraph",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 36.0f),
                    PathNode.LineTo(96.0f, 36.0f),
                    PathNode.CurveTo(58.444637f, 36.0f, 28.0f, 66.44463f, 28.0f, 104.0f),
                    PathNode.CurveTo(28.0f, 141.55536f, 58.444637f, 172.0f, 96.0f, 172.0f),
                    PathNode.LineTo(132.0f, 172.0f),
                    PathNode.LineTo(132.0f, 208.0f),
                    PathNode.CurveTo(132.0f, 214.62741f, 137.37259f, 220.0f, 144.0f, 220.0f),
                    PathNode.CurveTo(150.62741f, 220.0f, 156.0f, 214.62741f, 156.0f, 208.0f),
                    PathNode.LineTo(156.0f, 60.0f),
                    PathNode.LineTo(172.0f, 60.0f),
                    PathNode.LineTo(172.0f, 208.0f),
                    PathNode.CurveTo(172.0f, 214.62741f, 177.37259f, 220.0f, 184.0f, 220.0f),
                    PathNode.CurveTo(190.62741f, 220.0f, 196.0f, 214.62741f, 196.0f, 208.0f),
                    PathNode.LineTo(196.0f, 60.0f),
                    PathNode.LineTo(208.0f, 60.0f),
                    PathNode.CurveTo(214.62741f, 60.0f, 220.0f, 54.62742f, 220.0f, 48.0f),
                    PathNode.CurveTo(220.0f, 41.37258f, 214.62741f, 36.0f, 208.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(132.0f, 148.0f),
                    PathNode.LineTo(96.0f, 148.0f),
                    PathNode.CurveTo(71.69947f, 148.0f, 52.0f, 128.30052f, 52.0f, 104.0f),
                    PathNode.CurveTo(52.0f, 79.69947f, 71.69947f, 60.0f, 96.0f, 60.0f),
                    PathNode.LineTo(132.0f, 60.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _paragraph!!
    }

private var _paragraph: ImageVector? = null

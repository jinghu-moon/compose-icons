package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SupersetOf: ImageVector
    get() {
        if (_supersetOf != null) return _supersetOf!!
        _supersetOf = phosphorBoldIcon(
            name = "SupersetOf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(220.0f, 200.0f),
                    PathNode.CurveTo(220.0f, 206.62741f, 214.62741f, 212.0f, 208.0f, 212.0f),
                    PathNode.LineTo(56.0f, 212.0f),
                    PathNode.CurveTo(49.37258f, 212.0f, 44.0f, 206.62741f, 44.0f, 200.0f),
                    PathNode.CurveTo(44.0f, 193.37259f, 49.37258f, 188.0f, 56.0f, 188.0f),
                    PathNode.LineTo(208.0f, 188.0f),
                    PathNode.CurveTo(214.62741f, 188.0f, 220.0f, 193.37259f, 220.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 148.0f),
                    PathNode.LineTo(56.0f, 148.0f),
                    PathNode.CurveTo(49.37258f, 148.0f, 44.0f, 153.37259f, 44.0f, 160.0f),
                    PathNode.CurveTo(44.0f, 166.62741f, 49.37258f, 172.0f, 56.0f, 172.0f),
                    PathNode.LineTo(152.0f, 172.0f),
                    PathNode.CurveTo(189.55536f, 172.0f, 220.0f, 141.55536f, 220.0f, 104.0f),
                    PathNode.CurveTo(220.0f, 66.44463f, 189.55536f, 36.0f, 152.0f, 36.0f),
                    PathNode.LineTo(56.0f, 36.0f),
                    PathNode.CurveTo(49.37258f, 36.0f, 44.0f, 41.37258f, 44.0f, 48.0f),
                    PathNode.CurveTo(44.0f, 54.62742f, 49.37258f, 60.0f, 56.0f, 60.0f),
                    PathNode.LineTo(152.0f, 60.0f),
                    PathNode.CurveTo(176.30052f, 60.0f, 196.0f, 79.69947f, 196.0f, 104.0f),
                    PathNode.CurveTo(196.0f, 128.30052f, 176.30052f, 148.0f, 152.0f, 148.0f),
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
        return _supersetOf!!
    }

private var _supersetOf: ImageVector? = null

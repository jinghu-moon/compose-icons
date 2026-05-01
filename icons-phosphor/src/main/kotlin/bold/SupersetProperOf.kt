package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SupersetProperOf: ImageVector
    get() {
        if (_supersetProperOf != null) return _supersetProperOf!!
        _supersetProperOf = phosphorBoldIcon(
            name = "SupersetProperOf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.0f, 128.0f),
                    PathNode.CurveTo(227.94489f, 178.78735f, 186.78735f, 219.94489f, 136.0f, 220.0f),
                    PathNode.LineTo(64.0f, 220.0f),
                    PathNode.CurveTo(57.37258f, 220.0f, 52.0f, 214.62741f, 52.0f, 208.0f),
                    PathNode.CurveTo(52.0f, 201.37259f, 57.37258f, 196.0f, 64.0f, 196.0f),
                    PathNode.LineTo(136.0f, 196.0f),
                    PathNode.CurveTo(173.55536f, 196.0f, 204.0f, 165.55536f, 204.0f, 128.0f),
                    PathNode.CurveTo(204.0f, 90.44463f, 173.55536f, 60.0f, 136.0f, 60.0f),
                    PathNode.LineTo(64.0f, 60.0f),
                    PathNode.CurveTo(57.37258f, 60.0f, 52.0f, 54.62742f, 52.0f, 48.0f),
                    PathNode.CurveTo(52.0f, 41.37258f, 57.37258f, 36.0f, 64.0f, 36.0f),
                    PathNode.LineTo(136.0f, 36.0f),
                    PathNode.CurveTo(186.78735f, 36.055115f, 227.94489f, 77.21265f, 228.0f, 128.0f),
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
        return _supersetProperOf!!
    }

private var _supersetProperOf: ImageVector? = null

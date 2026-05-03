package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SpeakerSimpleNone: ImageVector
    get() {
        if (_speakerSimpleNone != null) return _speakerSimpleNone!!
        _speakerSimpleNone = phosphorFillIcon(
            name = "SpeakerSimpleNone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(163.52f, 24.81f),
                    PathNode.CurveTo(160.7727f, 23.468376f, 157.50098f, 23.809908f, 155.09f, 25.69f),
                    PathNode.LineTo(85.25f, 80.0f),
                    PathNode.LineTo(40.0f, 80.0f),
                    PathNode.CurveTo(31.163445f, 80.0f, 24.0f, 87.163445f, 24.0f, 96.0f),
                    PathNode.LineTo(24.0f, 160.0f),
                    PathNode.CurveTo(24.0f, 168.83656f, 31.163445f, 176.0f, 40.0f, 176.0f),
                    PathNode.LineTo(85.25f, 176.0f),
                    PathNode.LineTo(155.09f, 230.31f),
                    PathNode.CurveTo(156.491f, 231.40771f, 158.2202f, 232.0029f, 160.0f, 232.0f),
                    PathNode.CurveTo(164.41827f, 232.0f, 168.0f, 228.41827f, 168.0f, 224.0f),
                    PathNode.LineTo(168.0f, 32.0f),
                    PathNode.CurveTo(168.0023f, 28.944445f, 166.26389f, 26.154444f, 163.52f, 24.81f),
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
        return _speakerSimpleNone!!
    }

private var _speakerSimpleNone: ImageVector? = null

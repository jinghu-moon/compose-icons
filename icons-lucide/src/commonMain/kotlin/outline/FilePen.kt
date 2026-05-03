package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FilePen: ImageVector
    get() {
        if (_filePen != null) return _filePen!!
        _filePen = lucideOutlineIcon(
            name = "FilePen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.659f, 22.0f),
                    PathNode.LineTo(18.0f, 22.0f),
                    PathNode.CurveTo(19.10457f, 22.0f, 20.0f, 21.10457f, 20.0f, 20.0f),
                    PathNode.LineTo(20.0f, 8.0f),
                    PathNode.CurveTo(20.00157f, 7.359942f, 19.747406f, 6.745774f, 19.294f, 6.294f),
                    PathNode.LineTo(15.706f, 2.706f),
                    PathNode.CurveTo(15.254227f, 2.252594f, 14.640058f, 1.99843f, 14.0f, 2.0f),
                    PathNode.LineTo(6.0f, 2.0f),
                    PathNode.CurveTo(4.895431f, 2.0f, 4.0f, 2.895431f, 4.0f, 4.0f),
                    PathNode.LineTo(4.0f, 13.34f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.0f, 2.0f),
                    PathNode.LineTo(14.0f, 7.0f),
                    PathNode.CurveTo(14.0f, 7.552285f, 14.447715f, 8.0f, 15.0f, 8.0f),
                    PathNode.LineTo(20.0f, 8.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.378f, 12.622f),
                    PathNode.CurveTo(11.207255f, 11.793572f, 12.551073f, 11.794245f, 13.3795f, 12.6235f),
                    PathNode.CurveTo(14.207927f, 13.452756f, 14.207255f, 14.796573f, 13.378f, 15.625f),
                    PathNode.LineTo(8.36f, 20.637f),
                    PathNode.CurveTo(8.122379f, 20.874752f, 7.828666f, 21.048779f, 7.506f, 21.143f),
                    PathNode.LineTo(4.639f, 21.98f),
                    PathNode.CurveTo(4.463735f, 22.031118f, 4.274542f, 21.982649f, 4.145447f, 21.853554f),
                    PathNode.CurveTo(4.016352f, 21.724459f, 3.967881f, 21.535263f, 4.019f, 21.36f),
                    PathNode.LineTo(4.855f, 18.491f),
                    PathNode.CurveTo(4.949374f, 18.168694f, 5.123391f, 17.87534f, 5.361f, 17.638f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _filePen!!
    }

private var _filePen: ImageVector? = null

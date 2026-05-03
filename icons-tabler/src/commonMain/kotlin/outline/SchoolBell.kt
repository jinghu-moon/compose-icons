package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SchoolBell: ImageVector
    get() {
        if (_schoolBell != null) return _schoolBell!!
        _schoolBell = tablerOutlineIcon(
            name = "SchoolBell",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 17.0f),
                    PathNode.CurveTo(4.0f, 18.656855f, 5.343146f, 20.0f, 7.0f, 20.0f)
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
                    PathNode.MoveTo(14.805f, 6.37f),
                    PathNode.LineTo(17.588f, 3.586f),
                    PathNode.CurveTo(18.36893f, 2.804793f, 19.635294f, 2.804569f, 20.4165f, 3.5855f),
                    PathNode.CurveTo(21.197706f, 4.366431f, 21.197931f, 5.632794f, 20.417f, 6.414f),
                    PathNode.LineTo(17.633f, 9.2f)
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
                    PathNode.MoveTo(16.505f, 7.495f),
                    PathNode.CurveTo(18.428759f, 9.41852f, 18.506168f, 12.512691f, 16.681f, 14.53f),
                    PathNode.LineTo(16.505f, 14.714f),
                    PathNode.LineTo(14.638f, 16.581f),
                    PathNode.CurveTo(14.04038f, 17.178036f, 13.68033f, 17.972063f, 13.625f, 18.815f),
                    PathNode.LineTo(13.617f, 19.045f),
                    PathNode.LineTo(13.617f, 19.979f),
                    PathNode.CurveTo(13.617f, 20.306f, 13.487f, 20.619f, 13.257f, 20.85f),
                    PathNode.CurveTo(13.08289f, 21.025286f, 12.808177f, 21.050566f, 12.605f, 20.91f),
                    PathNode.LineTo(12.535f, 20.85f),
                    PathNode.LineTo(3.15f, 11.466f),
                    PathNode.CurveTo(3.054127f, 11.370326f, 3.000249f, 11.240444f, 3.000249f, 11.105f),
                    PathNode.CurveTo(3.000249f, 10.969556f, 3.054127f, 10.839674f, 3.15f, 10.744f),
                    PathNode.CurveTo(3.348f, 10.546f, 3.606f, 10.422f, 3.882f, 10.391f),
                    PathNode.LineTo(4.021f, 10.383f),
                    PathNode.LineTo(4.954f, 10.383f),
                    PathNode.CurveTo(5.802f, 10.383f, 6.617f, 10.074f, 7.251f, 9.519f),
                    PathNode.LineTo(7.419f, 9.362f),
                    PathNode.LineTo(9.286f, 7.495f),
                    PathNode.LineTo(9.446f, 7.342f),
                    PathNode.CurveTo(11.460617f, 5.495249f, 14.572291f, 5.562692f, 16.505f, 7.495f)
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
        return _schoolBell!!
    }

private var _schoolBell: ImageVector? = null

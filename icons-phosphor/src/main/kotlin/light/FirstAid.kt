package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FirstAid: ImageVector
    get() {
        if (_firstAid != null) return _firstAid!!
        _firstAid = phosphorLightIcon(
            name = "FirstAid",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 90.0f),
                    PathNode.LineTo(166.0f, 90.0f),
                    PathNode.LineTo(166.0f, 40.0f),
                    PathNode.CurveTo(166.0f, 32.268013f, 159.73198f, 26.0f, 152.0f, 26.0f),
                    PathNode.LineTo(104.0f, 26.0f),
                    PathNode.CurveTo(96.26801f, 26.0f, 90.0f, 32.268013f, 90.0f, 40.0f),
                    PathNode.LineTo(90.0f, 90.0f),
                    PathNode.LineTo(40.0f, 90.0f),
                    PathNode.CurveTo(32.268013f, 90.0f, 26.0f, 96.26801f, 26.0f, 104.0f),
                    PathNode.LineTo(26.0f, 152.0f),
                    PathNode.CurveTo(26.0f, 159.73198f, 32.268013f, 166.0f, 40.0f, 166.0f),
                    PathNode.LineTo(90.0f, 166.0f),
                    PathNode.LineTo(90.0f, 216.0f),
                    PathNode.CurveTo(90.0f, 223.73198f, 96.26801f, 230.0f, 104.0f, 230.0f),
                    PathNode.LineTo(152.0f, 230.0f),
                    PathNode.CurveTo(159.73198f, 230.0f, 166.0f, 223.73198f, 166.0f, 216.0f),
                    PathNode.LineTo(166.0f, 166.0f),
                    PathNode.LineTo(216.0f, 166.0f),
                    PathNode.CurveTo(223.73198f, 166.0f, 230.0f, 159.73198f, 230.0f, 152.0f),
                    PathNode.LineTo(230.0f, 104.0f),
                    PathNode.CurveTo(230.0f, 96.26801f, 223.73198f, 90.0f, 216.0f, 90.0f),
                    PathNode.Close,
                    PathNode.MoveTo(218.0f, 152.0f),
                    PathNode.CurveTo(218.0f, 153.10457f, 217.10457f, 154.0f, 216.0f, 154.0f),
                    PathNode.LineTo(160.0f, 154.0f),
                    PathNode.CurveTo(156.6863f, 154.0f, 154.0f, 156.6863f, 154.0f, 160.0f),
                    PathNode.LineTo(154.0f, 216.0f),
                    PathNode.CurveTo(154.0f, 217.10457f, 153.10457f, 218.0f, 152.0f, 218.0f),
                    PathNode.LineTo(104.0f, 218.0f),
                    PathNode.CurveTo(102.89543f, 218.0f, 102.0f, 217.10457f, 102.0f, 216.0f),
                    PathNode.LineTo(102.0f, 160.0f),
                    PathNode.CurveTo(102.0f, 156.6863f, 99.313705f, 154.0f, 96.0f, 154.0f),
                    PathNode.LineTo(40.0f, 154.0f),
                    PathNode.CurveTo(38.89543f, 154.0f, 38.0f, 153.10457f, 38.0f, 152.0f),
                    PathNode.LineTo(38.0f, 104.0f),
                    PathNode.CurveTo(38.0f, 102.89543f, 38.89543f, 102.0f, 40.0f, 102.0f),
                    PathNode.LineTo(96.0f, 102.0f),
                    PathNode.CurveTo(99.313705f, 102.0f, 102.0f, 99.313705f, 102.0f, 96.0f),
                    PathNode.LineTo(102.0f, 40.0f),
                    PathNode.CurveTo(102.0f, 38.89543f, 102.89543f, 38.0f, 104.0f, 38.0f),
                    PathNode.LineTo(152.0f, 38.0f),
                    PathNode.CurveTo(153.10457f, 38.0f, 154.0f, 38.89543f, 154.0f, 40.0f),
                    PathNode.LineTo(154.0f, 96.0f),
                    PathNode.CurveTo(154.0f, 99.313705f, 156.6863f, 102.0f, 160.0f, 102.0f),
                    PathNode.LineTo(216.0f, 102.0f),
                    PathNode.CurveTo(217.10457f, 102.0f, 218.0f, 102.89543f, 218.0f, 104.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _firstAid!!
    }

private var _firstAid: ImageVector? = null

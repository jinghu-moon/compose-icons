package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.WarningOctagon: ImageVector
    get() {
        if (_warningOctagon != null) return _warningOctagon!!
        _warningOctagon = phosphorRegularIcon(
            name = "WarningOctagon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(120.0f, 136.0f),
                    PathNode.LineTo(120.0f, 80.0f),
                    PathNode.CurveTo(120.0f, 75.58172f, 123.58172f, 72.0f, 128.0f, 72.0f),
                    PathNode.CurveTo(132.41827f, 72.0f, 136.0f, 75.58172f, 136.0f, 80.0f),
                    PathNode.LineTo(136.0f, 136.0f),
                    PathNode.CurveTo(136.0f, 140.41827f, 132.41827f, 144.0f, 128.0f, 144.0f),
                    PathNode.CurveTo(123.58172f, 144.0f, 120.0f, 140.41827f, 120.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 91.55f),
                    PathNode.LineTo(232.0f, 164.45f),
                    PathNode.CurveTo(232.01357f, 168.69579f, 230.32419f, 172.76974f, 227.31f, 175.76f),
                    PathNode.LineTo(175.76f, 227.31f),
                    PathNode.CurveTo(172.76974f, 230.32419f, 168.69579f, 232.01357f, 164.45f, 232.0f),
                    PathNode.LineTo(91.55f, 232.0f),
                    PathNode.CurveTo(87.30421f, 232.01357f, 83.230255f, 230.32419f, 80.24f, 227.31f),
                    PathNode.LineTo(28.69f, 175.76f),
                    PathNode.CurveTo(25.675812f, 172.76974f, 23.986435f, 168.69579f, 24.0f, 164.45f),
                    PathNode.LineTo(24.0f, 91.55f),
                    PathNode.CurveTo(23.986435f, 87.30421f, 25.675812f, 83.230255f, 28.69f, 80.24f),
                    PathNode.LineTo(80.24f, 28.69f),
                    PathNode.CurveTo(83.230255f, 25.675812f, 87.30421f, 23.986435f, 91.55f, 24.0f),
                    PathNode.LineTo(164.45f, 24.0f),
                    PathNode.CurveTo(168.69579f, 23.986435f, 172.76974f, 25.675812f, 175.76f, 28.69f),
                    PathNode.LineTo(227.31f, 80.24f),
                    PathNode.CurveTo(230.32419f, 83.230255f, 232.01357f, 87.30421f, 232.0f, 91.55f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 91.55f),
                    PathNode.LineTo(164.45f, 40.0f),
                    PathNode.LineTo(91.55f, 40.0f),
                    PathNode.LineTo(40.0f, 91.55f),
                    PathNode.LineTo(40.0f, 164.45f),
                    PathNode.LineTo(91.55f, 216.0f),
                    PathNode.LineTo(164.45f, 216.0f),
                    PathNode.LineTo(216.0f, 164.45f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 160.0f),
                    PathNode.CurveTo(121.37258f, 160.0f, 116.0f, 165.37259f, 116.0f, 172.0f),
                    PathNode.CurveTo(116.0f, 178.62741f, 121.37258f, 184.0f, 128.0f, 184.0f),
                    PathNode.CurveTo(134.62741f, 184.0f, 140.0f, 178.62741f, 140.0f, 172.0f),
                    PathNode.CurveTo(140.0f, 165.37259f, 134.62741f, 160.0f, 128.0f, 160.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _warningOctagon!!
    }

private var _warningOctagon: ImageVector? = null

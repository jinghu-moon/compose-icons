package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.LinkSimpleBreak: ImageVector
    get() {
        if (_linkSimpleBreak != null) return _linkSimpleBreak!!
        _linkSimpleBreak = phosphorLightIcon(
            name = "LinkSimpleBreak",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(214.2f, 118.18f),
                    PathNode.LineTo(184.13f, 148.25f),
                    PathNode.CurveTo(181.78555f, 150.59445f, 177.98445f, 150.59445f, 175.64f, 148.25f),
                    PathNode.CurveTo(173.29555f, 145.90555f, 173.29555f, 142.10445f, 175.64f, 139.76f),
                    PathNode.LineTo(205.72f, 109.69f),
                    PathNode.CurveTo(222.12563f, 93.28438f, 222.12561f, 66.685616f, 205.72f, 50.28f),
                    PathNode.CurveTo(189.31438f, 33.874386f, 162.71562f, 33.874386f, 146.31f, 50.28f),
                    PathNode.LineTo(116.24f, 80.34f),
                    PathNode.CurveTo(113.89555f, 82.68445f, 110.094444f, 82.68445f, 107.75f, 80.34f),
                    PathNode.CurveTo(105.405556f, 77.99555f, 105.405556f, 74.19445f, 107.75f, 71.85f),
                    PathNode.LineTo(137.82f, 41.85f),
                    PathNode.CurveTo(158.91176f, 20.758245f, 193.10825f, 20.758245f, 214.2f, 41.850002f),
                    PathNode.CurveTo(235.29175f, 62.941753f, 235.29175f, 97.138245f, 214.2f, 118.23f),
                    PathNode.Close,
                    PathNode.MoveTo(139.76f, 175.64f),
                    PathNode.LineTo(109.69f, 205.72f),
                    PathNode.CurveTo(93.28438f, 222.12563f, 66.685616f, 222.12561f, 50.28f, 205.72f),
                    PathNode.CurveTo(33.874386f, 189.31438f, 33.874386f, 162.71562f, 50.28f, 146.31f),
                    PathNode.LineTo(80.34f, 116.24f),
                    PathNode.CurveTo(82.68445f, 113.89555f, 82.68445f, 110.094444f, 80.34f, 107.75f),
                    PathNode.CurveTo(77.99555f, 105.405556f, 74.19445f, 105.405556f, 71.85f, 107.75f),
                    PathNode.LineTo(41.85f, 137.82f),
                    PathNode.CurveTo(20.755484f, 158.91176f, 20.753246f, 193.11049f, 41.845f, 214.205f),
                    PathNode.CurveTo(62.936756f, 235.29951f, 97.13548f, 235.30176f, 118.23f, 214.21f),
                    PathNode.LineTo(148.3f, 184.13f),
                    PathNode.CurveTo(150.64445f, 181.78555f, 150.64445f, 177.98445f, 148.3f, 175.64f),
                    PathNode.CurveTo(145.95555f, 173.29555f, 142.15445f, 173.29555f, 139.81f, 175.64f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _linkSimpleBreak!!
    }

private var _linkSimpleBreak: ImageVector? = null

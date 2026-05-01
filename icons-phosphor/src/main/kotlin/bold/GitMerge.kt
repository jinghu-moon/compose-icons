package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GitMerge: ImageVector
    get() {
        if (_gitMerge != null) return _gitMerge!!
        _gitMerge = phosphorBoldIcon(
            name = "GitMerge",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 108.0f),
                    PathNode.CurveTo(193.32228f, 108.017426f, 180.12057f, 116.93193f, 174.62f, 130.54f),
                    PathNode.LineTo(135.62f, 124.97f),
                    PathNode.CurveTo(134.6603f, 124.83413f, 133.78258f, 124.3544f, 133.15f, 123.62f),
                    PathNode.LineTo(100.55f, 85.53f),
                    PathNode.CurveTo(114.19447f, 76.026085f, 119.55457f, 58.413822f, 113.51783f, 42.92015f),
                    PathNode.CurveTo(107.48109f, 27.426483f, 91.618385f, 18.083176f, 75.14076f, 20.315628f),
                    PathNode.CurveTo(58.663136f, 22.54808f, 45.858387f, 35.775364f, 44.16188f, 52.316765f),
                    PathNode.CurveTo(42.46537f, 68.85816f, 52.318573f, 84.40927f, 68.0f, 89.94f),
                    PathNode.LineTo(68.0f, 166.06f),
                    PathNode.CurveTo(51.46944f, 171.90443f, 41.553535f, 188.808f, 44.51845f, 206.08879f),
                    PathNode.CurveTo(47.483368f, 223.3696f, 62.466694f, 236.00113f, 80.0f, 236.00113f),
                    PathNode.CurveTo(97.53331f, 236.00113f, 112.51663f, 223.3696f, 115.481544f, 206.08879f),
                    PathNode.CurveTo(118.446465f, 188.808f, 108.53056f, 171.90443f, 92.0f, 166.06f),
                    PathNode.LineTo(92.0f, 112.44f),
                    PathNode.LineTo(115.0f, 139.24f),
                    PathNode.CurveTo(119.42407f, 144.39777f, 125.57283f, 147.7707f, 132.3f, 148.73f),
                    PathNode.LineTo(173.64f, 154.64f),
                    PathNode.CurveTo(179.10612f, 172.30812f, 197.07053f, 182.96014f, 215.19505f, 179.2801f),
                    PathNode.CurveTo(233.31958f, 175.60007f, 245.70709f, 158.78535f, 243.8497f, 140.3845f),
                    PathNode.CurveTo(241.99231f, 121.98364f, 226.49435f, 107.9837f, 208.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 44.0f),
                    PathNode.CurveTo(86.62742f, 44.0f, 92.0f, 49.37258f, 92.0f, 56.0f),
                    PathNode.CurveTo(92.0f, 62.62742f, 86.62742f, 68.0f, 80.0f, 68.0f),
                    PathNode.CurveTo(73.37258f, 68.0f, 68.0f, 62.62742f, 68.0f, 56.0f),
                    PathNode.CurveTo(68.0f, 49.37258f, 73.37258f, 44.0f, 80.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 212.0f),
                    PathNode.CurveTo(73.37258f, 212.0f, 68.0f, 206.62741f, 68.0f, 200.0f),
                    PathNode.CurveTo(68.0f, 193.37259f, 73.37258f, 188.0f, 80.0f, 188.0f),
                    PathNode.CurveTo(86.62742f, 188.0f, 92.0f, 193.37259f, 92.0f, 200.0f),
                    PathNode.CurveTo(92.0f, 206.62741f, 86.62742f, 212.0f, 80.0f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 156.0f),
                    PathNode.CurveTo(201.37259f, 156.0f, 196.0f, 150.62741f, 196.0f, 144.0f),
                    PathNode.CurveTo(196.0f, 137.37259f, 201.37259f, 132.0f, 208.0f, 132.0f),
                    PathNode.CurveTo(214.62741f, 132.0f, 220.0f, 137.37259f, 220.0f, 144.0f),
                    PathNode.CurveTo(220.0f, 150.62741f, 214.62741f, 156.0f, 208.0f, 156.0f),
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
        return _gitMerge!!
    }

private var _gitMerge: ImageVector? = null

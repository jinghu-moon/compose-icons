package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.NumberTwo: ImageVector
    get() {
        if (_numberTwo != null) return _numberTwo!!
        _numberTwo = phosphorDuotoneIcon(
            name = "NumberTwo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 40.0f),
                    PathNode.LineTo(216.0f, 216.0f),
                    PathNode.CurveTo(216.0f, 224.83656f, 208.83656f, 232.0f, 200.0f, 232.0f),
                    PathNode.LineTo(56.0f, 232.0f),
                    PathNode.CurveTo(47.163445f, 232.0f, 40.0f, 224.83656f, 40.0f, 216.0f),
                    PathNode.LineTo(40.0f, 40.0f),
                    PathNode.CurveTo(40.0f, 31.163445f, 47.163445f, 24.0f, 56.0f, 24.0f),
                    PathNode.LineTo(200.0f, 24.0f),
                    PathNode.CurveTo(208.83656f, 24.0f, 216.0f, 31.163445f, 216.0f, 40.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(176.0f, 208.0f),
                    PathNode.CurveTo(176.0f, 212.41827f, 172.41827f, 216.0f, 168.0f, 216.0f),
                    PathNode.LineTo(88.0f, 216.0f),
                    PathNode.CurveTo(84.969826f, 216.0f, 82.19972f, 214.28798f, 80.84458f, 211.57771f),
                    PathNode.CurveTo(79.48945f, 208.86742f, 79.78189f, 205.62415f, 81.6f, 203.2f),
                    PathNode.LineTo(153.54f, 107.28f),
                    PathNode.CurveTo(160.52567f, 98.158066f, 162.0848f, 85.99121f, 157.62494f, 75.402596f),
                    PathNode.CurveTo(153.1651f, 64.81397f, 143.37091f, 57.429043f, 131.96399f, 56.05393f),
                    PathNode.CurveTo(120.55705f, 54.67881f, 109.28844f, 59.524605f, 102.44f, 68.75f),
                    PathNode.CurveTo(100.935425f, 70.75057f, 99.667015f, 72.91828f, 98.66f, 75.21f),
                    PathNode.CurveTo(96.88993f, 79.25825f, 92.17325f, 81.10507f, 88.125f, 79.335f),
                    PathNode.CurveTo(84.07675f, 77.564926f, 82.22993f, 72.84824f, 84.0f, 68.8f),
                    PathNode.CurveTo(91.40243f, 51.85529f, 107.87996f, 40.66932f, 126.36041f, 40.043125f),
                    PathNode.CurveTo(144.84087f, 39.41693f, 162.03778f, 49.461872f, 170.57024f, 65.866646f),
                    PathNode.CurveTo(179.10268f, 82.271416f, 177.4533f, 102.1187f, 166.33f, 116.89f),
                    PathNode.LineTo(104.0f, 200.0f),
                    PathNode.LineTo(168.0f, 200.0f),
                    PathNode.CurveTo(172.41827f, 200.0f, 176.0f, 203.58173f, 176.0f, 208.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _numberTwo!!
    }

private var _numberTwo: ImageVector? = null

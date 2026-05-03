package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CaretCircleDoubleUp: ImageVector
    get() {
        if (_caretCircleDoubleUp != null) return _caretCircleDoubleUp!!
        _caretCircleDoubleUp = phosphorFillIcon(
            name = "CaretCircleDoubleUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(201.58f, 54.43f),
                    PathNode.CurveTo(160.95647f, 13.840585f, 95.12319f, 13.859027f, 54.522396f, 54.471195f),
                    PathNode.CurveTo(13.921604f, 95.08337f, 13.921604f, 160.91664f, 54.522396f, 201.52881f),
                    PathNode.CurveTo(95.12319f, 242.14098f, 160.95647f, 242.15941f, 201.58f, 201.57f),
                    PathNode.CurveTo(242.14197f, 160.9096f, 242.14197f, 95.0904f, 201.58f, 54.43f),
                    PathNode.Close,
                    PathNode.MoveTo(165.68f, 173.68f),
                    PathNode.CurveTo(164.17946f, 175.18222f, 162.14328f, 176.02629f, 160.02f, 176.02629f),
                    PathNode.CurveTo(157.89673f, 176.02629f, 155.86055f, 175.18222f, 154.36f, 173.68f),
                    PathNode.LineTo(128.0f, 147.32f),
                    PathNode.LineTo(101.65f, 173.68f),
                    PathNode.CurveTo(98.52407f, 176.80594f, 93.45593f, 176.80594f, 90.33f, 173.68f),
                    PathNode.CurveTo(87.20407f, 170.55406f, 87.20407f, 165.48593f, 90.33f, 162.36f),
                    PathNode.LineTo(122.33f, 130.36f),
                    PathNode.CurveTo(123.83054f, 128.85779f, 125.86673f, 128.0137f, 127.99f, 128.0137f),
                    PathNode.CurveTo(130.11328f, 128.0137f, 132.14946f, 128.85779f, 133.65f, 130.36f),
                    PathNode.LineTo(165.65f, 162.36f),
                    PathNode.CurveTo(167.1562f, 163.85657f, 168.00568f, 165.8905f, 168.0113f, 168.01378f),
                    PathNode.CurveTo(168.01694f, 170.13705f, 167.17825f, 172.17548f, 165.68f, 173.68f),
                    PathNode.Close,
                    PathNode.MoveTo(165.68f, 117.68f),
                    PathNode.CurveTo(164.17946f, 119.18221f, 162.14328f, 120.02629f, 160.02f, 120.02629f),
                    PathNode.CurveTo(157.89673f, 120.02629f, 155.86055f, 119.18221f, 154.36f, 117.68f),
                    PathNode.LineTo(128.0f, 91.29f),
                    PathNode.LineTo(101.65f, 117.65f),
                    PathNode.CurveTo(98.52407f, 120.77593f, 93.45593f, 120.77593f, 90.33f, 117.65f),
                    PathNode.CurveTo(87.20407f, 114.52407f, 87.20407f, 109.45593f, 90.33f, 106.33f),
                    PathNode.LineTo(122.33f, 74.33f),
                    PathNode.CurveTo(123.83054f, 72.82778f, 125.86673f, 71.9837f, 127.99f, 71.9837f),
                    PathNode.CurveTo(130.11328f, 71.9837f, 132.14946f, 72.82778f, 133.65f, 74.33f),
                    PathNode.LineTo(165.65f, 106.33f),
                    PathNode.CurveTo(167.1562f, 107.82656f, 168.00568f, 109.860504f, 168.0113f, 111.98377f),
                    PathNode.CurveTo(168.01694f, 114.107056f, 167.17825f, 116.14548f, 165.68f, 117.65f),
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
        return _caretCircleDoubleUp!!
    }

private var _caretCircleDoubleUp: ImageVector? = null

package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GreaterThan: ImageVector
    get() {
        if (_greaterThan != null) return _greaterThan!!
        _greaterThan = phosphorLightIcon(
            name = "GreaterThan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(222.0f, 128.0f),
                    PathNode.CurveTo(221.99933f, 130.31747f, 220.66411f, 132.42735f, 218.57f, 133.42f),
                    PathNode.LineTo(66.57f, 205.42f),
                    PathNode.CurveTo(64.62542f, 206.39696f, 62.304287f, 206.2444f, 60.504303f, 205.02132f),
                    PathNode.CurveTo(58.70432f, 203.79826f, 57.7077f, 201.69643f, 57.89988f, 199.52873f),
                    PathNode.CurveTo(58.092064f, 197.36102f, 59.442917f, 195.46733f, 61.43f, 194.58f),
                    PathNode.LineTo(202.0f, 128.0f),
                    PathNode.LineTo(61.43f, 61.42f),
                    PathNode.CurveTo(59.442917f, 60.532677f, 58.092064f, 58.638973f, 57.89988f, 56.471275f),
                    PathNode.CurveTo(57.7077f, 54.303577f, 58.70432f, 52.20175f, 60.504303f, 50.97868f),
                    PathNode.CurveTo(62.304287f, 49.755608f, 64.62542f, 49.603046f, 66.57f, 50.58f),
                    PathNode.LineTo(218.57f, 122.58f),
                    PathNode.CurveTo(220.66411f, 123.57265f, 221.99933f, 125.68253f, 222.0f, 128.0f),
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
        return _greaterThan!!
    }

private var _greaterThan: ImageVector? = null

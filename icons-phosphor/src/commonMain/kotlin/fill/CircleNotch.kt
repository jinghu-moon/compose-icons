package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CircleNotch: ImageVector
    get() {
        if (_circleNotch != null) return _circleNotch!!
        _circleNotch = phosphorFillIcon(
            name = "CircleNotch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 24.0f),
                    PathNode.CurveTo(70.562386f, 24.0f, 24.0f, 70.562386f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 185.4376f, 70.562386f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(185.4376f, 232.0f, 232.0f, 185.4376f, 232.0f, 128.0f),
                    PathNode.CurveTo(231.93938f, 70.58752f, 185.41248f, 24.060629f, 128.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 200.0f),
                    PathNode.CurveTo(95.40811f, 200.00484f, 66.87747f, 178.11562f, 58.442436f, 146.63417f),
                    PathNode.CurveTo(50.007393f, 115.152725f, 63.7718f, 81.93111f, 92.0f, 65.64f),
                    PathNode.CurveTo(95.81065f, 63.57076f, 100.576126f, 64.91413f, 102.744995f, 68.668976f),
                    PathNode.CurveTo(104.91386f, 72.42382f, 103.696434f, 77.223015f, 100.0f, 79.49f),
                    PathNode.CurveTo(78.04979f, 92.16296f, 67.348145f, 117.999016f, 73.90816f, 142.4813f),
                    PathNode.CurveTo(80.46816f, 166.96356f, 102.65408f, 183.98743f, 128.0f, 183.98743f),
                    PathNode.CurveTo(153.34592f, 183.98743f, 175.53185f, 166.96356f, 182.09184f, 142.4813f),
                    PathNode.CurveTo(188.65186f, 117.999016f, 177.95021f, 92.16296f, 156.0f, 79.49f),
                    PathNode.CurveTo(152.30356f, 77.223015f, 151.08615f, 72.42382f, 153.255f, 68.668976f),
                    PathNode.CurveTo(155.42387f, 64.91413f, 160.18935f, 63.57076f, 164.0f, 65.64f),
                    PathNode.CurveTo(192.2282f, 81.93111f, 205.9926f, 115.152725f, 197.55757f, 146.63417f),
                    PathNode.CurveTo(189.12253f, 178.11562f, 160.59189f, 200.00484f, 128.0f, 200.0f),
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
        return _circleNotch!!
    }

private var _circleNotch: ImageVector? = null

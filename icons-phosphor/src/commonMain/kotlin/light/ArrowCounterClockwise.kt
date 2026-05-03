package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowCounterClockwise: ImageVector
    get() {
        if (_arrowCounterClockwise != null) return _arrowCounterClockwise!!
        _arrowCounterClockwise = phosphorLightIcon(
            name = "ArrowCounterClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(222.0f, 128.0f),
                    PathNode.CurveTo(222.00462f, 179.42667f, 180.68204f, 221.31067f, 129.26f, 222.0f),
                    PathNode.LineTo(128.0f, 222.0f),
                    PathNode.CurveTo(104.00384f, 222.05022f, 80.90831f, 212.86572f, 63.5f, 196.35f),
                    PathNode.CurveTo(61.88893f, 194.89067f, 61.193176f, 192.67409f, 61.681286f, 190.55585f),
                    PathNode.CurveTo(62.169388f, 188.4376f, 63.765015f, 186.74904f, 65.85226f, 186.1419f),
                    PathNode.CurveTo(67.9395f, 185.53477f, 70.19188f, 186.10405f, 71.74f, 187.63f),
                    PathNode.CurveTo(104.46322f, 218.48587f, 155.93398f, 217.22432f, 187.10626f, 184.80238f),
                    PathNode.CurveTo(218.27853f, 152.38043f, 217.51703f, 100.89985f, 185.39941f, 69.4141f),
                    PathNode.CurveTo(153.2818f, 37.92835f, 101.79625f, 38.189747f, 70.0f, 70.0f),
                    PathNode.LineTo(69.81f, 70.19f),
                    PathNode.LineTo(39.44f, 98.0f),
                    PathNode.LineTo(72.0f, 98.0f),
                    PathNode.CurveTo(75.313705f, 98.0f, 78.0f, 100.686295f, 78.0f, 104.0f),
                    PathNode.CurveTo(78.0f, 107.313705f, 75.313705f, 110.0f, 72.0f, 110.0f),
                    PathNode.LineTo(24.0f, 110.0f),
                    PathNode.CurveTo(20.68629f, 110.0f, 18.0f, 107.313705f, 18.0f, 104.0f),
                    PathNode.LineTo(18.0f, 56.0f),
                    PathNode.CurveTo(18.0f, 52.68629f, 20.68629f, 50.0f, 24.0f, 50.0f),
                    PathNode.CurveTo(27.31371f, 50.0f, 30.0f, 52.68629f, 30.0f, 56.0f),
                    PathNode.LineTo(30.0f, 90.34f),
                    PathNode.LineTo(61.63f, 61.4f),
                    PathNode.CurveTo(88.53993f, 34.56926f, 128.9575f, 26.579947f, 164.05197f, 41.154312f),
                    PathNode.CurveTo(199.14644f, 55.72868f, 222.01378f, 89.999565f, 222.0f, 128.0f),
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
        return _arrowCounterClockwise!!
    }

private var _arrowCounterClockwise: ImageVector? = null

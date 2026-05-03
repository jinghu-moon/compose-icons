package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Checks: ImageVector
    get() {
        if (_checks != null) return _checks!!
        _checks = phosphorLightIcon(
            name = "Checks",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(148.2f, 84.28f),
                    PathNode.LineTo(58.6f, 172.28f),
                    PathNode.CurveTo(56.266937f, 174.56686f, 52.53306f, 174.56686f, 50.2f, 172.28f),
                    PathNode.LineTo(11.8f, 134.57f),
                    PathNode.CurveTo(9.43346f, 132.2504f, 9.395404f, 128.45154f, 11.715f, 126.085f),
                    PathNode.CurveTo(14.034595f, 123.71847f, 17.83346f, 123.680405f, 20.2f, 126.0f),
                    PathNode.LineTo(54.4f, 159.58f),
                    PathNode.LineTo(139.8f, 75.71f),
                    PathNode.CurveTo(141.31161f, 74.12223f, 143.56885f, 73.485275f, 145.68748f, 74.04865f),
                    PathNode.CurveTo(147.8061f, 74.61202f, 149.44882f, 76.28603f, 149.97212f, 78.41492f),
                    PathNode.CurveTo(150.49544f, 80.54379f, 149.81601f, 82.78861f, 148.2f, 84.27f),
                    PathNode.Close,
                    PathNode.MoveTo(244.28f, 75.8f),
                    PathNode.CurveTo(241.9596f, 73.438126f, 238.16455f, 73.40233f, 235.8f, 75.72f),
                    PathNode.LineTo(150.4f, 159.59f),
                    PathNode.LineTo(130.17f, 139.72f),
                    PathNode.CurveTo(127.80622f, 137.39764f, 124.007355f, 137.43123f, 121.685f, 139.795f),
                    PathNode.CurveTo(119.36264f, 142.15878f, 119.396225f, 145.95764f, 121.76f, 148.28f),
                    PathNode.LineTo(146.2f, 172.28f),
                    PathNode.CurveTo(148.53307f, 174.56686f, 152.26694f, 174.56686f, 154.6f, 172.28f),
                    PathNode.LineTo(244.2f, 84.28f),
                    PathNode.CurveTo(246.56187f, 81.959595f, 246.59767f, 78.16455f, 244.28f, 75.8f),
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
        return _checks!!
    }

private var _checks: ImageVector? = null

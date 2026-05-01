package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Propeller: ImageVector
    get() {
        if (_propeller != null) return _propeller!!
        _propeller = tablerOutlineIcon(
            name = "Propeller",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.0f, 13.0f),
                    PathNode.CurveTo(9.0f, 14.656855f, 10.343145f, 16.0f, 12.0f, 16.0f),
                    PathNode.CurveTo(13.656855f, 16.0f, 15.0f, 14.656855f, 15.0f, 13.0f),
                    PathNode.CurveTo(15.0f, 11.343145f, 13.656855f, 10.0f, 12.0f, 10.0f),
                    PathNode.CurveTo(10.343145f, 10.0f, 9.0f, 11.343145f, 9.0f, 13.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.167f, 10.5f),
                    PathNode.CurveTo(14.889f, 8.962f, 15.323f, 7.457f, 15.47f, 5.986f),
                    PathNode.CurveTo(15.69f, 4.356f, 14.708f, 3.0f, 12.0f, 3.0f),
                    PathNode.CurveTo(9.292f, 3.0f, 8.310001f, 4.357f, 8.53f, 5.986f),
                    PathNode.CurveTo(8.677f, 7.457f, 9.111f, 8.962f, 9.833f, 10.5f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.169f, 16.751f),
                    PathNode.CurveTo(14.139f, 18.146f, 15.226f, 19.274f, 16.426f, 20.137f),
                    PathNode.CurveTo(17.726f, 21.137f, 19.393f, 20.97f, 20.747f, 18.625f),
                    PathNode.CurveTo(22.101f, 16.28f, 21.417f, 14.751f, 19.897f, 14.127f),
                    PathNode.CurveTo(18.549f, 13.519f, 17.029f, 13.142f, 15.335f, 12.999f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.664f, 13.0f),
                    PathNode.CurveTo(6.971f, 13.143f, 5.451f, 13.52f, 4.104f, 14.128f),
                    PathNode.CurveTo(2.582f, 14.751f, 1.898f, 16.281f, 3.252f, 18.626f),
                    PathNode.CurveTo(4.606f, 20.971f, 6.272f, 21.143f, 7.573f, 20.138f),
                    PathNode.CurveTo(8.773f, 19.275f, 9.86f, 18.147f, 10.831f, 16.752f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _propeller!!
    }

private var _propeller: ImageVector? = null

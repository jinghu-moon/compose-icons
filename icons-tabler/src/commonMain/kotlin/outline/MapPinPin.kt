package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MapPinPin: ImageVector
    get() {
        if (_mapPinPin != null) return _mapPinPin!!
        _mapPinPin = tablerOutlineIcon(
            name = "MapPinPin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.0f, 11.0f),
                    PathNode.CurveTo(9.0f, 12.656855f, 10.343145f, 14.0f, 12.0f, 14.0f),
                    PathNode.CurveTo(13.656855f, 14.0f, 15.0f, 12.656855f, 15.0f, 11.0f),
                    PathNode.CurveTo(15.0f, 9.343145f, 13.656855f, 8.0f, 12.0f, 8.0f),
                    PathNode.CurveTo(10.343145f, 8.0f, 9.0f, 9.343145f, 9.0f, 11.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.783f, 21.326f),
                    PathNode.CurveTo(12.032598f, 21.644905f, 11.163732f, 21.476355f, 10.587f, 20.9f),
                    PathNode.LineTo(6.343f, 16.657f),
                    PathNode.CurveTo(3.779599f, 14.09339f, 3.260555f, 10.126441f, 5.078101f, 6.98962f),
                    PathNode.CurveTo(6.895648f, 3.852799f, 10.595395f, 2.330314f, 14.094316f, 3.279353f),
                    PathNode.CurveTo(17.593237f, 4.228391f, 20.016598f, 7.411694f, 20.0f, 11.037f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(21.121f, 20.121f),
                    PathNode.CurveTo(21.979181f, 19.263077f, 22.236015f, 17.972652f, 21.771725f, 16.851519f),
                    PathNode.CurveTo(21.307436f, 15.730384f, 20.213469f, 14.999359f, 19.0f, 14.999359f),
                    PathNode.CurveTo(17.786531f, 14.999359f, 16.692564f, 15.730384f, 16.228275f, 16.851519f),
                    PathNode.CurveTo(15.763985f, 17.972652f, 16.020819f, 19.263077f, 16.879f, 20.121f),
                    PathNode.CurveTo(17.297f, 20.54f, 18.004f, 21.166f, 19.0f, 22.0f),
                    PathNode.CurveTo(20.051f, 21.11f, 20.759f, 20.484f, 21.121f, 20.121f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.0f, 18.0f),
                    PathNode.LineTo(19.0f, 18.01f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _mapPinPin!!
    }

private var _mapPinPin: ImageVector? = null

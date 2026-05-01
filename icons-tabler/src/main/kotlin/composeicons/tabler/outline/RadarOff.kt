package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.RadarOff: ImageVector
    get() {
        if (_radarOff != null) return _radarOff!!
        _radarOff = tablerOutlineIcon(
            name = "RadarOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.291f, 11.295f),
                    PathNode.CurveTo(11.006263f, 11.581437f, 10.921782f, 12.011037f, 11.076859f, 12.383962f),
                    PathNode.CurveTo(11.231934f, 12.756886f, 11.596117f, 12.999916f, 12.0f, 13.0f),
                    PathNode.LineTo(12.0f, 21.0f),
                    PathNode.CurveTo(14.488f, 21.0f, 16.74f, 19.99f, 18.37f, 18.358f),
                    PathNode.MoveTo(20.045f, 16.039f),
                    PathNode.CurveTo(20.674992f, 14.78594f, 21.002094f, 13.402513f, 21.0f, 12.0f),
                    PathNode.LineTo(16.0f, 12.0f)
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
                    PathNode.MoveTo(16.0f, 9.0f),
                    PathNode.CurveTo(14.825034f, 7.437369f, 12.847078f, 6.702912f, 10.937f, 7.12f),
                    PathNode.MoveTo(8.471f, 8.467f),
                    PathNode.CurveTo(7.445654f, 9.491147f, 6.915105f, 10.909787f, 7.016789f, 12.355427f),
                    PathNode.CurveTo(7.118472f, 13.801065f, 7.842386f, 15.131469f, 9.001f, 16.002f)
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
                    PathNode.MoveTo(20.486f, 9.0f),
                    PathNode.CurveTo(19.622631f, 6.56611f, 17.755335f, 4.62037f, 15.359012f, 3.657632f),
                    PathNode.CurveTo(12.962689f, 2.694893f, 10.268265f, 2.807933f, 7.961f, 3.968f),
                    PathNode.MoveTo(5.644f, 5.643f),
                    PathNode.CurveTo(3.457379f, 7.827511f, 2.544707f, 10.981262f, 3.226723f, 13.995936f),
                    PathNode.CurveTo(3.908739f, 17.010609f, 6.090019f, 19.464409f, 9.004f, 20.495f)
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
                    PathNode.MoveTo(3.0f, 3.0f),
                    PathNode.LineTo(21.0f, 21.0f)
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
        return _radarOff!!
    }

private var _radarOff: ImageVector? = null

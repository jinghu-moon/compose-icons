package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Trowel: ImageVector
    get() {
        if (_trowel != null) return _trowel!!
        _trowel = tablerOutlineIcon(
            name = "Trowel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.42f, 9.058f),
                    PathNode.LineTo(9.058f, 14.421f),
                    PathNode.CurveTo(8.573275f, 14.905673f, 7.872171f, 15.104836f, 7.205035f, 14.947371f),
                    PathNode.CurveTo(6.537898f, 14.789906f, 5.999845f, 14.298265f, 5.783f, 13.648f),
                    PathNode.LineTo(3.101f, 5.604f),
                    PathNode.CurveTo(2.864074f, 4.893234f, 3.049061f, 4.10961f, 3.578836f, 3.579836f),
                    PathNode.CurveTo(4.10861f, 3.050061f, 4.892234f, 2.865074f, 5.603f, 3.102f),
                    PathNode.LineTo(13.648f, 5.784f),
                    PathNode.CurveTo(14.297866f, 6.001001f, 14.789156f, 6.538848f, 14.94659f, 7.205653f),
                    PathNode.CurveTo(15.104025f, 7.872459f, 14.905181f, 8.573248f, 14.421f, 9.058f)
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
                    PathNode.MoveTo(10.0f, 10.0f),
                    PathNode.LineTo(16.5f, 16.5f)
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
                    PathNode.MoveTo(19.347f, 16.575f),
                    PathNode.LineTo(20.427f, 17.654f),
                    PathNode.CurveTo(21.192467f, 18.419743f, 21.192244f, 19.661034f, 20.4265f, 20.4265f),
                    PathNode.CurveTo(19.660757f, 21.191969f, 18.419466f, 21.191742f, 17.654f, 20.426f),
                    PathNode.LineTo(16.574f, 19.347f),
                    PathNode.CurveTo(15.808534f, 18.581257f, 15.808757f, 17.339966f, 16.5745f, 16.5745f),
                    PathNode.CurveTo(17.340242f, 15.809033f, 18.581533f, 15.809258f, 19.347f, 16.575f)
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
        return _trowel!!
    }

private var _trowel: ImageVector? = null

package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Metronome: ImageVector
    get() {
        if (_metronome != null) return _metronome!!
        _metronome = tablerOutlineIcon(
            name = "Metronome",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.153f, 8.188f),
                    PathNode.LineTo(13.433f, 4.952f),
                    PathNode.CurveTo(13.179292f, 3.811648f, 12.167734f, 3.000412f, 10.9995f, 3.000412f),
                    PathNode.CurveTo(9.831266f, 3.000412f, 8.819709f, 3.811648f, 8.566f, 4.952f),
                    PathNode.LineTo(5.541f, 18.566f),
                    PathNode.CurveTo(5.409367f, 19.15815f, 5.553596f, 19.778042f, 5.933108f, 20.251265f),
                    PathNode.CurveTo(6.312619f, 20.72449f, 6.886396f, 20.999895f, 7.493f, 21.0f),
                    PathNode.LineTo(14.507f, 21.0f),
                    PathNode.CurveTo(15.113605f, 20.999895f, 15.687381f, 20.72449f, 16.066893f, 20.251265f),
                    PathNode.CurveTo(16.446404f, 19.778042f, 16.590633f, 19.15815f, 16.459f, 18.566f),
                    PathNode.LineTo(15.935f, 16.209f),
                    PathNode.MoveTo(11.0f, 18.0f),
                    PathNode.LineTo(20.0f, 5.0f)
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
                    PathNode.MoveTo(19.0f, 5.0f),
                    PathNode.CurveTo(19.0f, 5.552285f, 19.447716f, 6.0f, 20.0f, 6.0f),
                    PathNode.CurveTo(20.552284f, 6.0f, 21.0f, 5.552285f, 21.0f, 5.0f),
                    PathNode.CurveTo(21.0f, 4.447716f, 20.552284f, 4.0f, 20.0f, 4.0f),
                    PathNode.CurveTo(19.447716f, 4.0f, 19.0f, 4.447716f, 19.0f, 5.0f)
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
        return _metronome!!
    }

private var _metronome: ImageVector? = null

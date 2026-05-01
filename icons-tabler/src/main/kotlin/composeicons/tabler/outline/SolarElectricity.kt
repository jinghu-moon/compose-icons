package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SolarElectricity: ImageVector
    get() {
        if (_solarElectricity != null) return _solarElectricity!!
        _solarElectricity = tablerOutlineIcon(
            name = "SolarElectricity",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 6.28f),
                    PathNode.LineTo(4.0f, 17.72f),
                    PathNode.CurveTo(4.000008f, 18.028015f, 4.14196f, 18.31884f, 4.384787f, 18.508335f),
                    PathNode.CurveTo(4.627614f, 18.697828f, 4.944218f, 18.764847f, 5.243f, 18.69f),
                    PathNode.LineTo(11.243f, 17.19f),
                    PathNode.CurveTo(11.687931f, 17.07854f, 11.999988f, 16.678679f, 12.0f, 16.22f),
                    PathNode.LineTo(12.0f, 7.78f),
                    PathNode.CurveTo(11.999988f, 7.321321f, 11.687931f, 6.921459f, 11.243f, 6.81f),
                    PathNode.LineTo(5.243f, 5.31f),
                    PathNode.CurveTo(4.944218f, 5.235152f, 4.627614f, 5.302171f, 4.384787f, 5.491666f),
                    PathNode.CurveTo(4.14196f, 5.68116f, 4.000008f, 5.971986f, 4.0f, 6.28f)
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
                    PathNode.MoveTo(8.0f, 6.0f),
                    PathNode.LineTo(8.0f, 18.0f)
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
                    PathNode.MoveTo(12.0f, 12.0f),
                    PathNode.LineTo(4.0f, 12.0f)
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
                    PathNode.MoveTo(20.0f, 7.0f),
                    PathNode.LineTo(17.0f, 12.0f),
                    PathNode.LineTo(21.0f, 12.0f),
                    PathNode.LineTo(18.0f, 17.0f)
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
        return _solarElectricity!!
    }

private var _solarElectricity: ImageVector? = null

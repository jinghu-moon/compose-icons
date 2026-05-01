package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AssemblyOff: ImageVector
    get() {
        if (_assemblyOff != null) return _assemblyOff!!
        _assemblyOff = tablerOutlineIcon(
            name = "AssemblyOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.376f, 18.377f),
                    PathNode.LineTo(13.092f, 21.72f),
                    PathNode.CurveTo(12.411835f, 22.093222f, 11.588165f, 22.093222f, 10.908f, 21.72f),
                    PathNode.LineTo(4.158f, 17.45f),
                    PathNode.CurveTo(3.446241f, 17.059809f, 3.002708f, 16.313692f, 3.0f, 15.502f),
                    PathNode.LineTo(3.0f, 8.217f),
                    PathNode.CurveTo(3.0f, 7.408f, 3.443f, 6.663f, 4.158f, 6.27f),
                    PathNode.LineTo(5.486f, 5.487f),
                    PathNode.MoveTo(8.0f, 4.0f),
                    PathNode.LineTo(10.908f, 2.29f),
                    PathNode.CurveTo(11.608304f, 1.903881f, 12.457696f, 1.903881f, 13.158f, 2.29f),
                    PathNode.LineTo(19.908f, 6.27f),
                    PathNode.LineTo(19.875f, 6.27f),
                    PathNode.CurveTo(20.575f, 6.668f, 21.005f, 7.413f, 21.0f, 8.218001f),
                    PathNode.LineTo(21.0f, 15.502f),
                    PathNode.CurveTo(21.0f, 15.919f, 20.882f, 16.319f, 20.67f, 16.662f)
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
                    PathNode.MoveTo(14.855f, 14.855f),
                    PathNode.LineTo(12.485f, 16.374f),
                    PathNode.CurveTo(12.183311f, 16.541315f, 11.816689f, 16.541315f, 11.515f, 16.374f),
                    PathNode.LineTo(8.515f, 14.452f),
                    PathNode.CurveTo(8.196709f, 14.275478f, 7.99946f, 13.939962f, 8.0f, 13.576f),
                    PathNode.LineTo(8.0f, 10.298f),
                    PathNode.CurveTo(8.0f, 9.934f, 8.197f, 9.598f, 8.514f, 9.421f),
                    PathNode.LineTo(9.077f, 9.085f),
                    PathNode.MoveTo(11.514f, 7.631f),
                    PathNode.CurveTo(11.824973f, 7.458333f, 12.203027f, 7.458333f, 12.514f, 7.631f),
                    PathNode.LineTo(15.514f, 9.421f),
                    PathNode.LineTo(15.5f, 9.421f),
                    PathNode.CurveTo(15.812f, 9.602f, 16.003f, 9.937f, 16.0f, 10.298f),
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
        return _assemblyOff!!
    }

private var _assemblyOff: ImageVector? = null

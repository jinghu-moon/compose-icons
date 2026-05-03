package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.EscalatorDown: ImageVector
    get() {
        if (_escalatorDown != null) return _escalatorDown!!
        _escalatorDown = tablerFilledIcon(
            name = "EscalatorDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.233f, 6.0f),
                    PathNode.CurveTo(7.973802f, 6.000189f, 8.688337f, 6.274462f, 9.239f, 6.77f),
                    PathNode.LineTo(18.384f, 15.0f),
                    PathNode.LineTo(19.5f, 15.0f),
                    PathNode.CurveTo(21.358501f, 14.999857f, 22.893047f, 16.452297f, 22.995f, 18.308f),
                    PathNode.LineTo(23.0f, 18.5f),
                    PathNode.CurveTo(23.0f, 20.432997f, 21.432997f, 22.0f, 19.5f, 22.0f),
                    PathNode.LineTo(16.767f, 22.0f),
                    PathNode.CurveTo(16.0262f, 21.999811f, 15.311663f, 21.725538f, 14.761f, 21.23f),
                    PathNode.LineTo(5.617f, 13.0f),
                    PathNode.LineTo(4.5f, 13.0f),
                    PathNode.CurveTo(2.641498f, 13.000143f, 1.106952f, 11.547704f, 1.005f, 9.692f),
                    PathNode.LineTo(1.0f, 9.5f),
                    PathNode.CurveTo(1.0f, 7.567004f, 2.567004f, 6.0f, 4.5f, 6.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.0f, 2.0f),
                    PathNode.CurveTo(18.552284f, 2.0f, 19.0f, 2.447715f, 19.0f, 3.0f),
                    PathNode.LineTo(19.0f, 7.584f),
                    PathNode.LineTo(20.293f, 6.293f),
                    PathNode.CurveTo(20.64927f, 5.936765f, 21.214914f, 5.901198f, 21.613f, 6.21f),
                    PathNode.LineTo(21.707f, 6.293f),
                    PathNode.CurveTo(22.097382f, 6.6835f, 22.097382f, 7.3165f, 21.707f, 7.707f),
                    PathNode.LineTo(18.707f, 10.707f),
                    PathNode.CurveTo(18.672117f, 10.742059f, 18.63468f, 10.774481f, 18.595f, 10.804f),
                    PathNode.LineTo(18.485f, 10.875f),
                    PathNode.LineTo(18.371f, 10.929f),
                    PathNode.LineTo(18.266f, 10.964f),
                    PathNode.LineTo(18.117f, 10.994f),
                    PathNode.LineTo(18.0f, 11.0f),
                    PathNode.LineTo(17.925f, 10.997f),
                    PathNode.LineTo(17.799f, 10.98f),
                    PathNode.LineTo(17.688f, 10.95f),
                    PathNode.LineTo(17.577f, 10.906f),
                    PathNode.LineTo(17.479f, 10.854f),
                    PathNode.LineTo(17.383f, 10.787f),
                    PathNode.LineTo(17.293f, 10.707f),
                    PathNode.LineTo(14.293f, 7.707f),
                    PathNode.CurveTo(14.033044f, 7.455926f, 13.928787f, 7.084122f, 14.020303f, 6.734493f),
                    PathNode.CurveTo(14.111818f, 6.384864f, 14.384863f, 6.111819f, 14.734492f, 6.020303f),
                    PathNode.CurveTo(15.084122f, 5.928787f, 15.455926f, 6.033044f, 15.707f, 6.293f),
                    PathNode.LineTo(17.0f, 7.586f),
                    PathNode.LineTo(17.0f, 3.0f),
                    PathNode.CurveTo(17.0f, 2.447715f, 17.447716f, 2.0f, 18.0f, 2.0f)
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
        return _escalatorDown!!
    }

private var _escalatorDown: ImageVector? = null

package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Gear: ImageVector
    get() {
        if (_gear != null) return _gear!!
        _gear = phosphorFillIcon(
            name = "Gear",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 130.16f),
                    PathNode.QuadTo(216.06f, 128.0f, 216.0f, 125.84f),
                    PathNode.LineTo(230.92f, 107.2f),
                    PathNode.CurveTo(232.50653f, 105.21524f, 233.05585f, 102.594826f, 232.4f, 100.14f),
                    PathNode.CurveTo(229.94972f, 90.947495f, 226.29117f, 82.120544f, 221.52f, 73.89f),
                    PathNode.CurveTo(220.2522f, 71.7066f, 218.02809f, 70.24981f, 215.52f, 69.96f),
                    PathNode.LineTo(191.8f, 67.32f),
                    PathNode.QuadTo(190.32f, 65.76f, 188.8f, 64.32f),
                    PathNode.LineTo(186.0f, 40.54f),
                    PathNode.CurveTo(185.70798f, 38.029984f, 184.24724f, 35.805496f, 182.06f, 34.54f),
                    PathNode.CurveTo(173.83005f, 29.772488f, 165.00269f, 26.120483f, 155.81f, 23.68f),
                    PathNode.CurveTo(153.35516f, 23.024155f, 150.73476f, 23.573477f, 148.75f, 25.16f),
                    PathNode.LineTo(130.16f, 40.0f),
                    PathNode.QuadTo(128.0f, 40.0f, 125.84f, 40.0f),
                    PathNode.LineTo(107.2f, 25.11f),
                    PathNode.CurveTo(105.21524f, 23.523476f, 102.594826f, 22.974154f, 100.14f, 23.63f),
                    PathNode.CurveTo(90.947495f, 26.080273f, 82.120544f, 29.738832f, 73.89f, 34.51f),
                    PathNode.CurveTo(71.7066f, 35.777798f, 70.24981f, 38.001904f, 69.96f, 40.51f),
                    PathNode.LineTo(67.32f, 64.27f),
                    PathNode.QuadTo(65.76f, 65.76f, 64.32f, 67.27f),
                    PathNode.LineTo(40.54f, 70.0f),
                    PathNode.CurveTo(38.029984f, 70.29202f, 35.805496f, 71.75277f, 34.54f, 73.94f),
                    PathNode.CurveTo(29.773468f, 82.17164f, 26.118343f, 90.99841f, 23.67f, 100.19f),
                    PathNode.CurveTo(23.016922f, 102.64641f, 23.569992f, 105.26699f, 25.16f, 107.25f),
                    PathNode.LineTo(40.0f, 125.84f),
                    PathNode.QuadTo(40.0f, 128.0f, 40.0f, 130.16f),
                    PathNode.LineTo(25.11f, 148.8f),
                    PathNode.CurveTo(23.523476f, 150.78476f, 22.974154f, 153.40517f, 23.63f, 155.86f),
                    PathNode.CurveTo(26.080273f, 165.0525f, 29.738832f, 173.87946f, 34.51f, 182.11f),
                    PathNode.CurveTo(35.777798f, 184.2934f, 38.001904f, 185.75018f, 40.51f, 186.04f),
                    PathNode.LineTo(64.23f, 188.68f),
                    PathNode.QuadTo(65.72f, 190.24f, 67.23f, 191.68f),
                    PathNode.LineTo(70.0f, 215.46f),
                    PathNode.CurveTo(70.29202f, 217.97002f, 71.75277f, 220.19449f, 73.94f, 221.46f),
                    PathNode.CurveTo(82.17164f, 226.22653f, 90.99841f, 229.88165f, 100.19f, 232.33f),
                    PathNode.CurveTo(102.64641f, 232.98308f, 105.26699f, 232.43f, 107.25f, 230.84f),
                    PathNode.LineTo(125.84f, 216.0f),
                    PathNode.QuadTo(128.0f, 216.06f, 130.16f, 216.0f),
                    PathNode.LineTo(148.8f, 230.92f),
                    PathNode.CurveTo(150.78476f, 232.50653f, 153.40517f, 233.05585f, 155.86f, 232.4f),
                    PathNode.CurveTo(165.05399f, 229.9541f, 173.8815f, 226.2953f, 182.11f, 221.52f),
                    PathNode.CurveTo(184.2934f, 220.2522f, 185.75018f, 218.02809f, 186.04f, 215.52f),
                    PathNode.LineTo(188.68f, 191.8f),
                    PathNode.QuadTo(190.24f, 190.32f, 191.68f, 188.8f),
                    PathNode.LineTo(215.46f, 186.0f),
                    PathNode.CurveTo(217.97002f, 185.70798f, 220.19449f, 184.24724f, 221.46f, 182.06f),
                    PathNode.CurveTo(226.22653f, 173.82835f, 229.88165f, 165.00159f, 232.33f, 155.81f),
                    PathNode.CurveTo(232.98308f, 153.35358f, 232.43f, 150.733f, 230.84f, 148.75f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 168.0f),
                    PathNode.CurveTo(105.90861f, 168.0f, 88.0f, 150.09138f, 88.0f, 128.0f),
                    PathNode.CurveTo(88.0f, 105.90861f, 105.90861f, 88.0f, 128.0f, 88.0f),
                    PathNode.CurveTo(150.09138f, 88.0f, 168.0f, 105.90861f, 168.0f, 128.0f),
                    PathNode.CurveTo(168.0f, 150.09138f, 150.09138f, 168.0f, 128.0f, 168.0f),
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
        }
        return _gear!!
    }

private var _gear: ImageVector? = null

package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.AddressBookTabs: ImageVector
    get() {
        if (_addressBookTabs != null) return _addressBookTabs!!
        _addressBookTabs = phosphorLightIcon(
            name = "AddressBookTabs",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 34.0f),
                    PathNode.LineTo(48.0f, 34.0f),
                    PathNode.CurveTo(40.268013f, 34.0f, 34.0f, 40.268013f, 34.0f, 48.0f),
                    PathNode.LineTo(34.0f, 208.0f),
                    PathNode.CurveTo(34.0f, 215.73198f, 40.268013f, 222.0f, 48.0f, 222.0f),
                    PathNode.LineTo(208.0f, 222.0f),
                    PathNode.CurveTo(215.73198f, 222.0f, 222.0f, 215.73198f, 222.0f, 208.0f),
                    PathNode.LineTo(222.0f, 48.0f),
                    PathNode.CurveTo(222.0f, 40.268013f, 215.73198f, 34.0f, 208.0f, 34.0f),
                    PathNode.Close,
                    PathNode.MoveTo(190.0f, 102.0f),
                    PathNode.LineTo(210.0f, 102.0f),
                    PathNode.LineTo(210.0f, 154.0f),
                    PathNode.LineTo(190.0f, 154.0f),
                    PathNode.Close,
                    PathNode.MoveTo(210.0f, 48.0f),
                    PathNode.LineTo(210.0f, 90.0f),
                    PathNode.LineTo(190.0f, 90.0f),
                    PathNode.LineTo(190.0f, 46.0f),
                    PathNode.LineTo(208.0f, 46.0f),
                    PathNode.CurveTo(209.10457f, 46.0f, 210.0f, 46.89543f, 210.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(46.0f, 208.0f),
                    PathNode.LineTo(46.0f, 48.0f),
                    PathNode.CurveTo(46.0f, 46.89543f, 46.89543f, 46.0f, 48.0f, 46.0f),
                    PathNode.LineTo(178.0f, 46.0f),
                    PathNode.LineTo(178.0f, 210.0f),
                    PathNode.LineTo(48.0f, 210.0f),
                    PathNode.CurveTo(46.89543f, 210.0f, 46.0f, 209.10457f, 46.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 210.0f),
                    PathNode.LineTo(190.0f, 210.0f),
                    PathNode.LineTo(190.0f, 166.0f),
                    PathNode.LineTo(210.0f, 166.0f),
                    PathNode.LineTo(210.0f, 208.0f),
                    PathNode.CurveTo(210.0f, 209.10457f, 209.10457f, 210.0f, 208.0f, 210.0f),
                    PathNode.Close,
                    PathNode.MoveTo(149.81f, 166.51f),
                    PathNode.CurveTo(147.09843f, 156.45914f, 140.38219f, 147.96082f, 131.23f, 143.0f),
                    PathNode.CurveTo(140.9227f, 134.90886f, 144.51204f, 121.61494f, 140.20883f, 109.74493f),
                    PathNode.CurveTo(135.90562f, 97.87491f, 124.63096f, 89.9696f, 112.005f, 89.9696f),
                    PathNode.CurveTo(99.37903f, 89.9696f, 88.104385f, 97.87491f, 83.80117f, 109.74493f),
                    PathNode.CurveTo(79.497955f, 121.61494f, 83.0873f, 134.90886f, 92.78f, 143.0f),
                    PathNode.CurveTo(83.626144f, 147.95645f, 76.90635f, 156.4511f, 74.19f, 166.5f),
                    PathNode.CurveTo(73.36157f, 169.70877f, 75.29123f, 172.98157f, 78.5f, 173.81f),
                    PathNode.CurveTo(81.70877f, 174.63843f, 84.981575f, 172.70877f, 85.81f, 169.5f),
                    PathNode.CurveTo(88.67f, 158.38f, 99.93f, 150.0f, 112.0f, 150.0f),
                    PathNode.CurveTo(124.07f, 150.0f, 135.34f, 158.38f, 138.19f, 169.49f),
                    PathNode.CurveTo(139.01843f, 172.69879f, 142.29123f, 174.62843f, 145.5f, 173.8f),
                    PathNode.CurveTo(148.70877f, 172.97157f, 150.63843f, 169.69879f, 149.81f, 166.49f),
                    PathNode.Close,
                    PathNode.MoveTo(94.0f, 120.0f),
                    PathNode.CurveTo(94.0f, 110.05888f, 102.05888f, 102.0f, 112.0f, 102.0f),
                    PathNode.CurveTo(121.94112f, 102.0f, 130.0f, 110.05888f, 130.0f, 120.0f),
                    PathNode.CurveTo(130.0f, 129.94113f, 121.94112f, 138.0f, 112.0f, 138.0f),
                    PathNode.CurveTo(102.05888f, 138.0f, 94.0f, 129.94113f, 94.0f, 120.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _addressBookTabs!!
    }

private var _addressBookTabs: ImageVector? = null

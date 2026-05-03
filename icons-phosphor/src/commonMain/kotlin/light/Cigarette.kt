package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Cigarette: ImageVector
    get() {
        if (_cigarette != null) return _cigarette!!
        _cigarette = phosphorLightIcon(
            name = "Cigarette",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 130.0f),
                    PathNode.LineTo(32.0f, 130.0f),
                    PathNode.CurveTo(24.268015f, 130.0f, 18.0f, 136.26802f, 18.0f, 144.0f),
                    PathNode.LineTo(18.0f, 176.0f),
                    PathNode.CurveTo(18.0f, 183.73198f, 24.268015f, 190.0f, 32.0f, 190.0f),
                    PathNode.LineTo(224.0f, 190.0f),
                    PathNode.CurveTo(231.73198f, 190.0f, 238.0f, 183.73198f, 238.0f, 176.0f),
                    PathNode.LineTo(238.0f, 144.0f),
                    PathNode.CurveTo(238.0f, 136.26802f, 231.73198f, 130.0f, 224.0f, 130.0f),
                    PathNode.Close,
                    PathNode.MoveTo(30.0f, 176.0f),
                    PathNode.LineTo(30.0f, 144.0f),
                    PathNode.CurveTo(30.0f, 142.89543f, 30.89543f, 142.0f, 32.0f, 142.0f),
                    PathNode.LineTo(82.0f, 142.0f),
                    PathNode.LineTo(82.0f, 178.0f),
                    PathNode.LineTo(32.0f, 178.0f),
                    PathNode.CurveTo(30.89543f, 178.0f, 30.0f, 177.10457f, 30.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(226.0f, 176.0f),
                    PathNode.CurveTo(226.0f, 177.10457f, 225.10457f, 178.0f, 224.0f, 178.0f),
                    PathNode.LineTo(94.0f, 178.0f),
                    PathNode.LineTo(94.0f, 142.0f),
                    PathNode.LineTo(224.0f, 142.0f),
                    PathNode.CurveTo(225.10457f, 142.0f, 226.0f, 142.89543f, 226.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(202.77f, 61.06f),
                    PathNode.CurveTo(210.58f, 47.18f, 210.68f, 39.15f, 209.39f, 34.86f),
                    PathNode.CurveTo(208.82571f, 32.615185f, 207.41823f, 30.674082f, 205.46f, 29.44f),
                    PathNode.CurveTo(202.90686f, 28.252104f, 201.52335f, 25.448503f, 202.13371f, 22.699495f),
                    PathNode.CurveTo(202.74406f, 19.950485f, 205.18405f, 17.99581f, 208.0f, 18.0f),
                    PathNode.CurveTo(208.8412f, 17.996498f, 209.67332f, 18.173836f, 210.44f, 18.52f),
                    PathNode.CurveTo(215.36852f, 21.044197f, 219.06062f, 25.46172f, 220.67f, 30.76f),
                    PathNode.CurveTo(223.85f, 40.34f, 221.35f, 52.51f, 213.23f, 66.94f),
                    PathNode.CurveTo(205.42f, 80.82f, 205.32f, 88.85f, 206.61f, 93.14f),
                    PathNode.CurveTo(207.16092f, 95.37192f, 208.55048f, 97.30582f, 210.49f, 98.54f),
                    PathNode.CurveTo(213.05954f, 99.71072f, 214.46509f, 102.51465f, 213.86555f, 105.27394f),
                    PathNode.CurveTo(213.26602f, 108.03323f, 210.82368f, 110.00111f, 208.0f, 110.0f),
                    PathNode.CurveTo(207.1588f, 110.0035f, 206.32668f, 109.826164f, 205.56f, 109.48f),
                    PathNode.CurveTo(200.63148f, 106.9558f, 196.93938f, 102.538284f, 195.33f, 97.24f),
                    PathNode.CurveTo(192.15f, 87.66f, 194.65f, 75.49f, 202.77f, 61.06f),
                    PathNode.Close,
                    PathNode.MoveTo(162.77f, 61.06f),
                    PathNode.CurveTo(170.58f, 47.18f, 170.68f, 39.15f, 169.39f, 34.86f),
                    PathNode.CurveTo(168.82571f, 32.615185f, 167.41823f, 30.674082f, 165.46f, 29.44f),
                    PathNode.CurveTo(162.90686f, 28.252104f, 161.52335f, 25.448503f, 162.13371f, 22.699495f),
                    PathNode.CurveTo(162.74406f, 19.950485f, 165.18405f, 17.99581f, 168.0f, 18.0f),
                    PathNode.CurveTo(168.8412f, 17.996498f, 169.67332f, 18.173836f, 170.44f, 18.52f),
                    PathNode.CurveTo(175.36852f, 21.044197f, 179.06062f, 25.46172f, 180.67f, 30.76f),
                    PathNode.CurveTo(183.85f, 40.34f, 181.35f, 52.51f, 173.23f, 66.94f),
                    PathNode.CurveTo(165.42f, 80.82f, 165.32f, 88.85f, 166.61f, 93.14f),
                    PathNode.CurveTo(167.16092f, 95.37192f, 168.55048f, 97.30582f, 170.49f, 98.54f),
                    PathNode.CurveTo(173.05954f, 99.71072f, 174.46509f, 102.51465f, 173.86555f, 105.27394f),
                    PathNode.CurveTo(173.26602f, 108.03323f, 170.82368f, 110.00111f, 168.0f, 110.0f),
                    PathNode.CurveTo(167.1588f, 110.0035f, 166.32668f, 109.826164f, 165.56f, 109.48f),
                    PathNode.CurveTo(160.63148f, 106.9558f, 156.93938f, 102.538284f, 155.33f, 97.24f),
                    PathNode.CurveTo(152.15f, 87.66f, 154.65f, 75.49f, 162.77f, 61.06f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _cigarette!!
    }

private var _cigarette: ImageVector? = null

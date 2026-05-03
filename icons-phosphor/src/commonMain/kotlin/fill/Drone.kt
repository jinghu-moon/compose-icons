package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Drone: ImageVector
    get() {
        if (_drone != null) return _drone!!
        _drone = phosphorFillIcon(
            name = "Drone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(189.66f, 77.66f),
                    PathNode.LineTo(160.0f, 107.31f),
                    PathNode.LineTo(160.0f, 148.69f),
                    PathNode.LineTo(189.66f, 178.34f),
                    PathNode.CurveTo(192.78593f, 181.46593f, 192.78593f, 186.53407f, 189.66f, 189.66f),
                    PathNode.CurveTo(186.53407f, 192.78593f, 181.46593f, 192.78593f, 178.34f, 189.66f),
                    PathNode.LineTo(148.69f, 160.0f),
                    PathNode.LineTo(107.31f, 160.0f),
                    PathNode.LineTo(77.66f, 189.66f),
                    PathNode.CurveTo(74.534065f, 192.78593f, 69.465935f, 192.78593f, 66.34f, 189.66f),
                    PathNode.CurveTo(63.21407f, 186.53407f, 63.21407f, 181.46593f, 66.34f, 178.34f),
                    PathNode.LineTo(96.0f, 148.69f),
                    PathNode.LineTo(96.0f, 107.31f),
                    PathNode.LineTo(66.34f, 77.66f),
                    PathNode.CurveTo(63.21407f, 74.534065f, 63.21407f, 69.465935f, 66.34f, 66.34f),
                    PathNode.CurveTo(69.465935f, 63.21407f, 74.534065f, 63.21407f, 77.66f, 66.34f),
                    PathNode.LineTo(107.31f, 96.0f),
                    PathNode.LineTo(148.69f, 96.0f),
                    PathNode.LineTo(178.34f, 66.34f),
                    PathNode.CurveTo(181.46593f, 63.21407f, 186.53407f, 63.21407f, 189.66f, 66.34f),
                    PathNode.CurveTo(192.78593f, 69.465935f, 192.78593f, 74.534065f, 189.66f, 77.66f),
                    PathNode.Close,
                    PathNode.MoveTo(143.38f, 71.54f),
                    PathNode.CurveTo(147.54419f, 73.01387f, 152.11485f, 70.83374f, 153.59f, 66.67f),
                    PathNode.CurveTo(157.94165f, 54.380062f, 170.19983f, 46.71993f, 183.15367f, 48.19569f),
                    PathNode.CurveTo(196.10747f, 49.671448f, 206.32857f, 59.89253f, 207.8043f, 72.846344f),
                    PathNode.CurveTo(209.28008f, 85.80016f, 201.61993f, 98.05836f, 189.33f, 102.41f),
                    PathNode.CurveTo(185.57953f, 103.65709f, 183.30185f, 107.45612f, 183.96904f, 111.351776f),
                    PathNode.CurveTo(184.63622f, 115.24743f, 188.04828f, 118.072014f, 192.0f, 118.0f),
                    PathNode.CurveTo(192.90993f, 118.00237f, 193.81334f, 117.846725f, 194.67f, 117.54f),
                    PathNode.CurveTo(213.98459f, 110.70337f, 226.02412f, 91.44006f, 223.70566f, 71.08282f),
                    PathNode.CurveTo(221.3872f, 50.72557f, 205.32443f, 34.662796f, 184.96718f, 32.344337f),
                    PathNode.CurveTo(164.60994f, 30.02588f, 145.34663f, 42.065414f, 138.51f, 61.38f),
                    PathNode.CurveTo(137.06883f, 65.529335f, 139.24272f, 70.06459f, 143.38f, 71.54f),
                    PathNode.Close,
                    PathNode.MoveTo(194.67f, 138.54f),
                    PathNode.CurveTo(190.53166f, 137.15536f, 186.04713f, 139.34267f, 184.59048f, 143.4562f),
                    PathNode.CurveTo(183.13383f, 147.56975f, 185.24251f, 152.09177f, 189.33f, 153.62f),
                    PathNode.CurveTo(201.61993f, 157.97165f, 209.28008f, 170.22983f, 207.8043f, 183.18365f),
                    PathNode.CurveTo(206.32857f, 196.13747f, 196.10747f, 206.35855f, 183.15367f, 207.8343f),
                    PathNode.CurveTo(170.19983f, 209.31007f, 157.94165f, 201.64993f, 153.59f, 189.36f),
                    PathNode.CurveTo(152.06177f, 185.2725f, 147.53975f, 183.16383f, 143.42621f, 184.62048f),
                    PathNode.CurveTo(139.31267f, 186.07713f, 137.12537f, 190.56166f, 138.51f, 194.7f),
                    PathNode.CurveTo(145.34663f, 214.01459f, 164.60994f, 226.05412f, 184.96718f, 223.73566f),
                    PathNode.CurveTo(205.32443f, 221.4172f, 221.3872f, 205.35443f, 223.70566f, 184.99718f),
                    PathNode.CurveTo(226.02412f, 164.63994f, 213.98459f, 145.37663f, 194.67f, 138.54f),
                    PathNode.Close,
                    PathNode.MoveTo(112.67f, 184.54f),
                    PathNode.CurveTo(108.50581f, 183.06613f, 103.93514f, 185.24626f, 102.46f, 189.41f),
                    PathNode.CurveTo(98.10835f, 201.69994f, 85.85017f, 209.36008f, 72.89635f, 207.88431f),
                    PathNode.CurveTo(59.942528f, 206.40855f, 49.721447f, 196.18747f, 48.24569f, 183.23366f),
                    PathNode.CurveTo(46.769928f, 170.27983f, 54.430065f, 158.02164f, 66.72f, 153.67f),
                    PathNode.CurveTo(70.807495f, 152.14177f, 72.91617f, 147.61975f, 71.45952f, 143.50621f),
                    PathNode.CurveTo(70.00286f, 139.39265f, 65.51835f, 137.20538f, 61.38f, 138.59f),
                    PathNode.CurveTo(42.065414f, 145.42664f, 30.02588f, 164.68994f, 32.344337f, 185.04718f),
                    PathNode.CurveTo(34.662796f, 205.40443f, 50.72557f, 221.46721f, 71.08282f, 223.78566f),
                    PathNode.CurveTo(91.44006f, 226.10413f, 110.70337f, 214.06459f, 117.54f, 194.75f),
                    PathNode.CurveTo(118.27039f, 192.73384f, 118.16079f, 190.50887f, 117.23579f, 188.57425f),
                    PathNode.CurveTo(116.310776f, 186.63963f, 114.64782f, 185.15736f, 112.62f, 184.46f),
                    PathNode.Close,
                    PathNode.MoveTo(61.38f, 117.54f),
                    PathNode.CurveTo(62.220856f, 117.84107f, 63.106876f, 117.996635f, 64.0f, 118.0f),
                    PathNode.CurveTo(67.8942f, 117.99822f, 71.221405f, 115.192635f, 71.88082f, 111.35467f),
                    PathNode.CurveTo(72.540245f, 107.5167f, 70.34029f, 103.76147f, 66.67f, 102.46f),
                    PathNode.CurveTo(54.380062f, 98.10835f, 46.71993f, 85.85017f, 48.19569f, 72.89635f),
                    PathNode.CurveTo(49.671448f, 59.942528f, 59.89253f, 49.721447f, 72.846344f, 48.24569f),
                    PathNode.CurveTo(85.80016f, 46.769928f, 98.05836f, 54.430065f, 102.41f, 66.72f),
                    PathNode.CurveTo(103.32743f, 69.462006f, 105.65305f, 71.495575f, 108.492935f, 72.03905f),
                    PathNode.CurveTo(111.33281f, 72.58252f, 114.24494f, 71.55129f, 116.109955f, 69.341774f),
                    PathNode.CurveTo(117.97497f, 67.13225f, 118.50259f, 64.08831f, 117.49f, 61.38f),
                    PathNode.CurveTo(110.65337f, 42.065414f, 91.39006f, 30.02588f, 71.032814f, 32.344337f),
                    PathNode.CurveTo(50.67557f, 34.662796f, 34.612797f, 50.72557f, 32.29434f, 71.08282f),
                    PathNode.CurveTo(29.97588f, 91.44006f, 42.015415f, 110.70337f, 61.33f, 117.54f),
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
        return _drone!!
    }

private var _drone: ImageVector? = null

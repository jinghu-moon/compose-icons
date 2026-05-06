package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TrayArrowDown: ImageVector
    get() {
        if (_trayArrowDown != null) return _trayArrowDown!!
        _trayArrowDown = phosphorLightIcon(
            name = "TrayArrowDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 34h-160C40.268 34 34 40.268 34 48v160c0 7.732 6.268 14 14 14h160c7.732 0 14-6.268 14-14v-160c0-7.732-6.268-14-14-14ZM48 46h160c1.105 0 2 .895 2 2v106h-30.69c-3.714-.007-7.278 1.469-9.9 4.1l-19.31 19.31c-.373 .376-.88 .588-1.41 .59h-41.38c-.528 0-1.035-.208-1.41-.58L86.59 158.1C83.968 155.469 80.404 153.993 76.69 154h-30.69v-106c0-1.105 .895-2 2-2ZM208 210h-160c-1.105 0-2-.895-2-2v-42h30.69c.528-0 1.035 .208 1.41 .58l19.31 19.32c2.622 2.631 6.186 4.107 9.9 4.1h41.38c3.714 .007 7.278-1.469 9.9-4.1l19.31-19.31c.373-.376 .88-.588 1.41-.59h30.69v42c0 1.105-.895 2-2 2ZM91.76 124.24c-2.203-2.364-2.138-6.048 .147-8.333 2.285-2.285 5.969-2.35 8.333-.147L122 137.51v-65.51c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v65.51l21.76-21.75c2.364-2.203 6.048-2.138 8.333 .147 2.285 2.285 2.35 5.969 .147 8.333l-32 32c-2.343 2.34-6.137 2.34-8.48 0Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _trayArrowDown!!
    }

private var _trayArrowDown: ImageVector? = null

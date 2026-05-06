package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.VideoCameraSlash: ImageVector
    get() {
        if (_videoCameraSlash != null) return _videoCameraSlash!!
        _videoCameraSlash = phosphorBoldIcon(
            name = "VideoCameraSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M249.45 69.31c-4.026-2.048-8.86-1.661-12.51 1L212 88.43v-16.43C212 60.954 203.046 52 192 52h-68.12c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h64.12v68c.002 3.624 1.641 7.053 4.46 9.33 .15 .13 .31 .25 .48 .38l44 32c3.651 2.656 8.484 3.039 12.507 .989 4.023-2.05 6.555-6.184 6.553-10.699v-96c-0-4.511-2.531-8.641-6.55-10.69ZM232 152.43 212 137.89v-19.78l20-14.54ZM56.88 31.93C54.012 28.697 49.628 27.256 45.401 28.157c-4.226 .901-7.642 4.005-8.942 8.126-1.3 4.121-.284 8.623 2.661 11.786L42.69 52h-10.69C20.954 52 12 60.954 12 72v112c0 11.046 8.954 20 20 20h148.87l18.25 20.07c4.478 4.81 11.991 5.124 16.854 .704 4.863-4.42 5.267-11.928 .906-16.844ZM36 180v-104h28.51l94.55 104Z"),
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
        return _videoCameraSlash!!
    }

private var _videoCameraSlash: ImageVector? = null

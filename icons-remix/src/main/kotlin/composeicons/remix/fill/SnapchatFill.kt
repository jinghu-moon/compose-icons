package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SnapchatFill: ImageVector
    get() {
        if (_snapchatFill != null) return _snapchatFill!!
        _snapchatFill = remixIcon(
            name = "SnapchatFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11.872 21.764c-1.19 0-1.984-.562-2.693-1.057-.504-.357-.976-.695-1.534-.789-.272-.049-.548-.067-.802-.067-.473 0-.847 .071-1.115 .125-.169 .031-.312 .058-.424 .058-.116 0-.263-.031-.321-.227-.049-.161-.08-.312-.111-.459-.08-.37-.147-.597-.285-.62C3.098 18.501 2.207 18.158 2.033 17.752c-.013-.045-.031-.089-.031-.125-.009-.125 .08-.227 .205-.25 1.181-.196 2.242-.825 3.139-1.859 .695-.803 1.034-1.578 1.066-1.663 0-.009 .009-.009 .009-.009 .169-.352 .205-.651 .103-.896-.192-.459-.825-.655-1.257-.789-.111-.031-.205-.067-.285-.094-.37-.147-.985-.459-.905-.892 .058-.312 .473-.535 .811-.535 .094 0 .174 .013 .241 .049 .379 .174 .722 .263 1.016 .263 .366 0 .539-.138 .584-.183-.009-.196-.022-.401-.036-.593C6.602 8.813 6.5 7.119 6.932 6.147 8.23 3.241 10.985 3.009 11.801 3.009c.022 0 .357-.009 .357-.009 .013 0 .031 0 .049 0 .816 0 3.571 .227 4.868 3.139 .437 .972 .33 2.67 .241 4.03l-.009 .067c-.009 .183-.022 .357-.031 .535 .045 .036 .205 .169 .535 .174 .285-.009 .597-.103 .954-.263 .111-.049 .227-.067 .312-.067 .125 0 .25 .031 .357 .067h.009c.299 .111 .495 .321 .495 .539 .009 .205-.152 .517-.914 .825-.08 .031-.174 .067-.285 .094-.424 .129-1.057 .334-1.257 .789-.111 .241-.067 .548 .102 .896 0 .009 .009 .009 .009 .009 .049 .125 1.337 3.049 4.204 3.526 .125 .022 .205 .125 .205 .25 0 .045-.009 .089-.031 .129-.174 .41-1.057 .745-2.555 .976-.138 .022-.205 .25-.285 .62-.031 .151-.067 .299-.111 .459-.045 .147-.138 .227-.299 .227h-.022c-.103 0-.241-.013-.424-.049-.321-.067-.673-.116-1.114-.116-.263 0-.535 .022-.803 .067-.553 .089-1.03 .432-1.534 .789-.718 .49-1.516 1.052-2.697 1.052 0 0-.218 0-.254 0Z"),
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
        return _snapchatFill!!
    }

private var _snapchatFill: ImageVector? = null

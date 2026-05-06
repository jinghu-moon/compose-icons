package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.DiscordLine: ImageVector
    get() {
        if (_discordLine != null) return _discordLine!!
        _discordLine = remixIcon(
            name = "DiscordLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8.521 13.846c-1.04 0-1.889-.944-1.889-2.101 0-1.157 .828-2.101 1.889-2.101 1.051 0 1.91 .945 1.889 2.101 0 1.157-.838 2.101-1.889 2.101ZM15.494 13.846c-1.04 0-1.89-.944-1.89-2.101 0-1.157 .829-2.101 1.89-2.101 1.051 0 1.91 .945 1.889 2.101 0 1.157-.828 2.101-1.889 2.101ZM10.125 4.323 9.817 3.76l-.633 .106C7.719 4.11 6.327 4.547 5.025 5.146l-.229 .105-.141 .209C2.042 9.314 1.326 13.109 1.68 16.836l.039 .406 .33 .24c1.739 1.264 3.425 2.036 5.078 2.543l.789 .242L9.03 17.551c1.91 .472 4.029 .472 5.939 0l1.107 2.717 .791-.243c1.65-.506 3.347-1.278 5.08-2.545l.326-.238 .041-.402C22.749 12.521 21.616 8.758 19.355 5.457l-.142-.207-.228-.104C17.677 4.547 16.285 4.11 14.831 3.866l-.618-.104-.314 .542c-.087 .151-.177 .321-.262 .493C12.544 4.685 11.456 4.684 10.373 4.797c-.084-.169-.17-.333-.247-.474ZM6.714 16.61c.198 .114 .405 .226 .611 .328l-.449 1.096C5.756 17.626 4.618 17.064 3.448 16.256 3.223 13.118 3.861 9.951 6.012 6.686c.898-.395 1.842-.703 2.824-.913 .06 .125 .116 .248 .162 .356l.273 .643 .691-.101c1.353-.198 2.715-.199 4.09 0l.69 .1 .272-.642c.047-.112 .102-.234 .16-.356 .978 .21 1.924 .519 2.829 .915 1.875 2.82 2.821 5.966 2.546 9.567-1.165 .807-2.306 1.37-3.429 1.778l-.446-1.095c.206-.102 .414-.214 .613-.329 .49-.282 1.017-.634 1.354-.971L17.361 14.36c-.164 .164-.524 .421-.977 .682-.444 .256-.885 .463-1.167 .556-2.004 .662-4.428 .662-6.432 0-.282-.093-.722-.3-1.167-.556-.454-.262-.814-.518-.978-.682L5.361 15.64c.336 .336 .864 .688 1.354 .971Z"),
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
        return _discordLine!!
    }

private var _discordLine: ImageVector? = null
